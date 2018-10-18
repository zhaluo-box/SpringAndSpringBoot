package com.zhaluo.box.spring.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
//@ComponentScan("com.zhaluo.box.spring.profile")
public class ProfileConfig {

    @Bean
    @Profile("dev")
    public DemoBean devDemoBean() {
        return  new DemoBean("dev 开发环境");
    }

    @Bean
    @Profile("prod")
    public DemoBean prodDemoBean() {
        return  new DemoBean("生产环境");
    }
}
