package com.zhaluo.box.spring.Aware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AwareConfig.class);
        AwareService  service = context.getBean(AwareService.class);

        service.outputResult();
        context.close();
    }

}
