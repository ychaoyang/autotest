package com.autotest.annotation;

import com.autotest.extension.AutoTestExtension;
import com.autotest.extension.AutoTestParameterProvider;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.provider.ArgumentsSource;

import java.lang.annotation.*;


/**
 * Created by huairen on 2017/7/13.
 */
@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@TestTemplate
@ExtendWith(AutoTestExtension.class)
@ArgumentsSource(AutoTestParameterProvider.class)
public @interface AutoTest {

    String name() default "[{index}] {arguments}";

    String file();

    String encoding() default "UTF-8";

    /**根据项目名称生成base类*/
    String project() default "";
}
