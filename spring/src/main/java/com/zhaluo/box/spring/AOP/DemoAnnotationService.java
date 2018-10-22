package com.zhaluo.box.spring.AOP;

import org.springframework.stereotype.Service;

@Service
public class DemoAnnotationService {

    @Action(name = "ADD** action name")
    public void add(){
        System.out.println("DemoAnnotationService.add 方法");
    }
}
