package com.zhaluo.box.spring.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class JSR250WayService {

    /**
     * bean 销毁之后执行
     */
    @PostConstruct
    public void init() {
        System.out.println("@JSR250 - init - method 构造之后执行");
    }

    /**
     * 构造函数 创建bean
     */
    public JSR250WayService() {
        super();
        System.out.println("初始化构造函数 - JSR250WayService");
    }

    /**
     * bean销毁之前执行
     */
    @PreDestroy
    public void destory() {
        System.out.println("@JSR250 - destory -method bean销毁之前执行");
    }

}
