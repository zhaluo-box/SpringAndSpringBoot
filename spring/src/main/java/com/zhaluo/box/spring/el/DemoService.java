package com.zhaluo.box.spring.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service
public class DemoService {

    @Value("蕾哈娜")
    private String another;

    public void setAnother(String another) {
        this.another = another;
    }

    public String getAnother() {
        return another;
    }
}
