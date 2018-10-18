package com.zhaluo.box.spring.applicationEvent;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 事件监听器
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {

    @Override
    public void onApplicationEvent(DemoEvent event) {

        String msg = event.getMsg();
        System.out.println("我监听到了bean-demoPublisher发布的消息" + msg);
    }
}
