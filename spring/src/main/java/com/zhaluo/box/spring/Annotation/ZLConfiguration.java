package com.zhaluo.box.spring.Annotation;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.lang.annotation.*;

/**
 * 自定义注解
 *      组合Configuration 和 componentScan
 *      在类上标注
 *      运行时.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Configuration  //组合configuation元注解
@ComponentScan  //祝贺componentScan 元注解
public @interface ZLConfiguration {

    String[] value() default {} ; //覆盖value参数;

}
