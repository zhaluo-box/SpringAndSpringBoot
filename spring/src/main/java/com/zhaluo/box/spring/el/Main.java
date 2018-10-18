package com.zhaluo.box.spring.el;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                   new AnnotationConfigApplicationContext(Config.class);
        
        Config resourceService = context.getBean(Config.class);
        resourceService.outputResource();
        context.close();
   }
}
