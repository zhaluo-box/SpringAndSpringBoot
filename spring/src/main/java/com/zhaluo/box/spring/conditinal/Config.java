package com.zhaluo.box.spring.conditinal;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    @Conditional(WinCond.class)
    public Service windows(){
        return new Windows();
    }

    @Bean
    @Conditional(LinuxCond.class)
    public Service linux(){
        return new Linux();
    }
}
