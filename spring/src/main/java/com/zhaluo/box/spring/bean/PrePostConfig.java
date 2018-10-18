package com.zhaluo.box.spring.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.zhaluo.box.spring.bean")
public class PrePostConfig {

    @Bean(initMethod = "init", destroyMethod = "destory")  //initMethod destory 指定创建之后和销毁之前要执行的方法
    public BeanWayService beanWayService() {
        return new BeanWayService();
    }

    @Bean
    public JSR250WayService jsr250WayService() {
        return new JSR250WayService();
    }

}
