package com.zhaluo.box.spring.AOP;

import org.springframework.stereotype.Service;

@Service
public class DemoMethodService {

    public void add() {
        System.out.println("DemoMethodService.add 方法");
    }

}