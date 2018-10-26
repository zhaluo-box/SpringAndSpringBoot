package com.zhaluo.box.springMVC4.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
@ComponentScan("com.zhaluo.box.springMVC4")
public class MvcConfig  {

    @Bean
    public InternalResourceViewResolver viewResolver(){
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();

        viewResolver.setPrefix("/WEB-INF/classes/views/"); //前缀设置 [运行时的路径]
        viewResolver.setSuffix(".jsp"); //后缀设置

        viewResolver.setViewClass(JstlView.class);
        return viewResolver;

    }

}
