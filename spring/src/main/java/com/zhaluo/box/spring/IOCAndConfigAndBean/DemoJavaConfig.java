package com.zhaluo.box.spring.IOCAndConfigAndBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoJavaConfig {

    @Bean
    public UserService userService(){
        return new UserService();
    }

    //bean actionService 重载了两种Bean的注入方式;推荐后一种.也是Spring容器推荐的方法,将某个Bean以参数的形式传入
    @Bean
    public ActionService actionService(){
        ActionService actionService = new ActionService();
        actionService.setUserService(userService());
        return actionService;
    }

    @Bean
    public ActionService actionService(UserService userService) {
        ActionService actionService = new ActionService();
        actionService.setUserService(userService);
        return actionService;
    }
}
