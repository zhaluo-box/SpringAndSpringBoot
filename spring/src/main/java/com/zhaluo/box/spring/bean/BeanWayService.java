package com.zhaluo.box.spring.bean;

public class BeanWayService {

    /**
     * bean 销毁之后执行
     */
    public void init() {
        System.out.println("@bean - init - method 构造之后执行");
    }

    /**
     * 构造函数 创建bean
     */
    public BeanWayService() {
        super();
        System.out.println("初始化构造函数 - BeayWayService");
    }

    /**
     * bean销毁之前执行
     */
    public void destory() {
        System.out.println("@bean - destory -method bean销毁之前执行");
    }
}
