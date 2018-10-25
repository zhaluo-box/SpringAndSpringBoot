package com.zhaluo.box.spring.conditinal;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        Service service = context.getBean(Service.class);

        System.out.println(service.show());

        context.close();
    }
}
