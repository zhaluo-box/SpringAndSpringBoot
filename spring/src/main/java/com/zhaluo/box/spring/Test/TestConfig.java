package com.zhaluo.box.spring.Test;

import com.zhaluo.box.entity.TestEntity;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class TestConfig {

    @Bean
    @Profile("dev")
    public TestEntity devTestEntity(){
        return new TestEntity("dev",01);
    }

    @Bean
    @Profile("prod")
    public TestEntity prodTestEntity(){
        return new TestEntity("prod",02);
    }
}
