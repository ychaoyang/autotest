package com.autotest.extension;

import com.autotest.annotation.AutoTest;
import com.autotest.mybatis.Dalgen;
import org.junit.jupiter.api.extension.*;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.support.AnnotationConsumerInitializer;
import org.junit.platform.commons.util.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.DependencyDescriptor;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.core.MethodParameter;
import org.springframework.core.annotation.AnnotatedElementUtils;
import org.springframework.core.annotation.SynthesizingMethodParameter;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestContextManager;
import org.springframework.util.Assert;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Stream;

import static org.junit.platform.commons.util.AnnotationUtils.findAnnotation;
import static org.junit.platform.commons.util.AnnotationUtils.findRepeatableAnnotations;

/**
 * Created by huairen on 2017/7/14.
 */
public class AutoTestExtension implements TestTemplateInvocationContextProvider, BeforeAllCallback, AfterAllCallback,
		TestInstancePostProcessor, BeforeEachCallback, AfterEachCallback, BeforeTestExecutionCallback,
		AfterTestExecutionCallback {
	protected static final Logger logger = LoggerFactory.getLogger(AutoTestExtension.class.getName());

	private static final ExtensionContext.Namespace NAMESPACE = ExtensionContext.Namespace.create("AutoTestExtension",
			"DataDeal");

	private int num = 0;

	@Override
	public boolean supportsTestTemplate(ExtensionContext context) {
		return AnnotationUtils.isAnnotated(context.getTestMethod(), AutoTest.class);
	}

	@Override
	public Stream<TestTemplateInvocationContext> provideTestTemplateInvocationContexts(ExtensionContext context) {
		Method templateMethod = Preconditions.notNull(context.getTestMethod().orElse(null),
				"test method must not be null");
		AutoTestNameFormatter formatter = createNameFormatter(templateMethod);
		AtomicLong invocationCount = new AtomicLong(0L);
		return (Stream) findRepeatableAnnotations(templateMethod, ArgumentsSource.class)
				.stream()
				.map(ArgumentsSource::value)
				.map(ReflectionUtils::newInstance)
				.map(provider -> AnnotationConsumerInitializer.initialize(templateMethod, provider))
				.flatMap(provider -> arguments(provider, context))
				.map(Arguments::get)
				.map((arguments) -> {
					return new AutoTestInvocationContext(formatter, arguments);
				})
				.peek((invocationContext) -> {
					invocationCount.incrementAndGet();
				}).onClose(() -> {
					Preconditions.condition(invocationCount.get() > 0L, () -> {
						return "当使用注解 @" + AutoTest.class.getSimpleName() + " 的时候,测试方法需要至少一个参数";
					});
				});

	}


	@Override
	public void beforeAll(ExtensionContext context) throws Exception {
		if (isSpringSupport(context)) {
			getTestContextManager(context).beforeTestClass();
		}
	}

	@Override
	public void afterAll(ExtensionContext context) throws Exception {
		if (isSpringSupport(context)) {
			try {
				getTestContextManager(context).afterTestClass();
			} finally {
				context.getStore(NAMESPACE).remove(context.getTestClass().get());
			}
		}
	}

	@Override
	public void postProcessTestInstance(Object testInstance, ExtensionContext context) throws Exception {
		if (isSpringSupport(context)) {
			getTestContextManager(context).prepareTestInstance(testInstance);
		}
	}

	@Override
	public void beforeEach(ExtensionContext context) throws Exception {
		if (isSpringSupport(context)) {
			Object testInstance = context.getTestInstance();
			Method testMethod = context.getTestMethod().get();
			getTestContextManager(context).beforeTestMethod(testInstance, testMethod);
		}
	}


	@Override
	public void beforeTestExecution(ExtensionContext context) throws Exception {
		if (isSpringSupport(context)) {
			Object testInstance = context.getTestInstance();
			Method testMethod = context.getTestMethod().get();
			getTestContextManager(context).beforeTestExecution(testInstance, testMethod);
		}
		int times = context.getStore(NAMESPACE).get("times", int.class);
		String methodName = context.getStore(NAMESPACE).get("methodName", String.class);
		logger.info("========[{}]共执行[{}]次, 开始执行第[{}]轮========", methodName, times, num++ < times ? num : times);
	}

	@Override
	public void afterTestExecution(ExtensionContext context) throws Exception {
		if (isSpringSupport(context)) {
			Object testInstance = context.getTestInstance();
			Method testMethod = context.getTestMethod().get();
			Throwable testException = context.getExecutionException().orElse(null);
			getTestContextManager(context).afterTestExecution(testInstance, testMethod, testException);
		}
	}

	@Override
	public void afterEach(ExtensionContext context) throws Exception {
		if (isSpringSupport(context)) {
			Object testInstance = context.getTestInstance();
			Method testMethod = context.getTestMethod().get();
			Throwable testException = context.getExecutionException().orElse(null);
			getTestContextManager(context).afterTestMethod(testInstance, testMethod, testException);
		}
	}


	private AutoTestNameFormatter createNameFormatter(Method templateMethod) {
		AutoTest autoTest = findAnnotation(templateMethod, AutoTest.class).get();
		String name = autoTest.name().trim();
		if (StringUtils.isBlank(name)) {
			logger.warn(String.format(
					"Configuration error: @AutoTest on method [%s] must be declared with a non-empty name.",
					templateMethod));
//			name = AnnotationUtils.getDefaultValue(autoTest, "name", String.class).get();
		}

		return new AutoTestNameFormatter(name);
	}

	protected static Stream<? extends Arguments> arguments(ArgumentsProvider provider, ExtensionContext context) {
		try {
			return provider.provideArguments(context);
		} catch (Exception e) {
			throw ExceptionUtils.throwAsUncheckedException(e);
		}
	}

	static ApplicationContext getApplicationContext(ExtensionContext context) {
		return getTestContextManager(context).getTestContext().getApplicationContext();
	}

	private static TestContextManager getTestContextManager(ExtensionContext context) {
		Assert.notNull(context, "ExtensionContext must not be null");
		Class<?> testClass = context.getTestClass().get();
		ExtensionContext.Store store = context.getStore(NAMESPACE);
		return store.getOrComputeIfAbsent(testClass, TestContextManager::new, TestContextManager.class);
	}

	static boolean isAutowirable(Parameter parameter) {
		return ApplicationContext.class.isAssignableFrom(parameter.getType())
				|| AnnotatedElementUtils.hasAnnotation(parameter, Autowired.class)
				|| AnnotatedElementUtils.hasAnnotation(parameter, Qualifier.class)
				|| AnnotatedElementUtils.hasAnnotation(parameter, Value.class);
	}

	static Object resolveDependency(Parameter parameter, Class<?> containingClass, ApplicationContext
			applicationContext) {
		boolean required = findMergedAnnotation(parameter, Autowired.class).map(Autowired::required).orElse(true);
		MethodParameter methodParameter = SynthesizingMethodParameter.forParameter(parameter);
		DependencyDescriptor descriptor = new DependencyDescriptor(methodParameter, required);
		descriptor.setContainingClass(containingClass);
		return applicationContext.getAutowireCapableBeanFactory().resolveDependency(descriptor, null);
	}

	private static <A extends Annotation> Optional<A> findMergedAnnotation(AnnotatedElement element, Class<A>
			annotationType) {
		return Optional.ofNullable(AnnotatedElementUtils.findMergedAnnotation(element, annotationType));
	}

	/**
	 * 是否需要支持spring
	 */
	private boolean isSpringSupport(ExtensionContext context) {
		Class<?> clazz = context.getTestClass().get();
		boolean result = false;
		while (!clazz.equals(Object.class)) {
			boolean isContextConfiguration = false;
			if (clazz.isAnnotationPresent(ContextConfiguration.class)
//					|| clazz.isAnnotationPresent(SpringBootTest.class)
					) {
				isContextConfiguration = true;
			}
			if (isContextConfiguration) {
				result = true;
				break;
			}
			clazz = clazz.getSuperclass();
		}
		return result;
	}
}
