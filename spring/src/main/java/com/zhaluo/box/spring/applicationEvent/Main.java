package com.zhaluo.box.spring.applicationEvent;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);

        //从自动注入的上下文中获取DemoPublisher这个bean
        DemoPublisher demoPublisher = context.getBean(DemoPublisher.class);

        demoPublisher.publish("hello event");

        context.close();

    }
}
