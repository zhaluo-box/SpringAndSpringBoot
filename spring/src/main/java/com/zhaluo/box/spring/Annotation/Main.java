package com.zhaluo.box.spring.Annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        Demo demo = context.getBean(Demo.class);
        demo.showTime();

        context.close();
    }
}
