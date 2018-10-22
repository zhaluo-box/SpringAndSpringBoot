package com.zhaluo.box.spring.IOCAndConfigAndBean;

public class ActionService {

    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void sayHello(String  word){
        userService.say(word);
    }
}
