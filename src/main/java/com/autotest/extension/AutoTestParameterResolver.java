package com.autotest.extension;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.api.extension.ParameterResolutionException;
import org.junit.jupiter.api.extension.ParameterResolver;
import org.junit.jupiter.params.converter.ArgumentConverter;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.converter.DefaultArgumentConverter;
import org.junit.jupiter.params.support.AnnotationConsumerInitializer;
import org.junit.platform.commons.util.AnnotationUtils;
import org.junit.platform.commons.util.ReflectionUtils;

import java.lang.reflect.Executable;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Optional;

/**
 * Created by huairen on 2017/7/17.
 */
public class AutoTestParameterResolver implements ParameterResolver {

	private final Object[] arguments;

	AutoTestParameterResolver(Object[] arguments) {
		this.arguments = arguments;
	}

	@Override
	public boolean supportsParameter(ParameterContext parameterContext, ExtensionContext extensionContext) {
		Executable declaringExecutable = parameterContext.getParameter().getDeclaringExecutable();
		Method testMethod = extensionContext.getTestMethod().orElse(null);
		return declaringExecutable.equals(testMethod) && parameterContext.getIndex() < arguments.length;
	}

	@Override
	public Object resolveParameter(ParameterContext parameterContext, ExtensionContext extensionContext)
			throws ParameterResolutionException {
		Object argument = arguments[parameterContext.getIndex()];
		Parameter parameter = parameterContext.getParameter();
		Optional<ConvertWith> annotation = AnnotationUtils.findAnnotation(parameter, ConvertWith.class);
		// @formatter:off
		ArgumentConverter argumentConverter = annotation.map(ConvertWith::value)
				.map(clazz -> (ArgumentConverter) ReflectionUtils.newInstance(clazz))
				.map(converter -> AnnotationConsumerInitializer.initialize(parameter, converter))
				.orElse(DefaultArgumentConverter.INSTANCE);
		// @formatter:on
		try {
			return argumentConverter.convert(argument, parameterContext);
		} catch (Exception ex) {
			throw new ParameterResolutionException("参数转换出错:" + parameter.getType().getName()+":"+parameter.getName(),
					ex);
		}
	}

}