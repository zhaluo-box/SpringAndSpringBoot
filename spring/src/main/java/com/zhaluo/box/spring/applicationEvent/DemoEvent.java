package com.zhaluo.box.spring.applicationEvent;

import lombok.Data;
import org.springframework.context.ApplicationEvent;


public class DemoEvent  extends ApplicationEvent {

    private String msg;

    public DemoEvent(Object Source, String msg) {
         super(Source);
         this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
