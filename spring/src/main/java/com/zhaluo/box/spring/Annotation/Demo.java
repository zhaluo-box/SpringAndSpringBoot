package com.zhaluo.box.spring.Annotation;


import org.springframework.stereotype.Service;

@Service
public class Demo {

    public  void showTime (){

        System.out.println("元注解起作用了");
    }
}
