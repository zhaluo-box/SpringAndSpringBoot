package com.zhaluo.box.spring.AOP;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Aspect
@Component
public class LogASpect {

    @Pointcut("@annotation(com.zhaluo.box.spring.AOP.Action)")
    public void annotationPointCut(){

    }

    @After("annotationPointCut()") //后置通知
    public void after (JoinPoint joinPoint) {

        MethodSignature signature = (MethodSignature)joinPoint.getSignature();
        Method method = signature.getMethod();
        Action action = method.getAnnotation(Action.class);
        System.out.println("注解+切点拦截【后置通知】" + action.name());
    }

    /*
     注意编写拦截规则   * com.zhaluo.box.spring.AOP.*.*(..)  在 AOP包后面是两个 *(任意类) ．*（任意方法）
        至于 最后的（。。） 代表任意参数
     */
    @Before("execution(* com.zhaluo.box.spring.AOP.*.*(..))") //前置通知
    public void before (JoinPoint joinPoint) {

        MethodSignature signature = (MethodSignature)joinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println("拦截规则 拦截【前置通知】"+ method.getName());
    }
}
