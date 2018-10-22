package com.zhaluo.box.spring.IOCAndConfigAndBean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoJavaConfig.class);

        ActionService actionService = context.getBean(ActionService.class);
        System.out.println("=====     =====      =====");
        actionService.sayHello("hello java Config and bean IOC");
        System.out.println("=====     =====      =====");

        context.close();

    }
}
