package com.zhaluo.box.spring.AOP;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/*
    config 只要配置包扫描和启动切面编程
 */
@Configuration
@ComponentScan("com.zhaluo.box.spring.AOP")
@EnableAspectJAutoProxy
public class AopConfig {

}
