package com.zhaluo.box.spring.Scheduled;

import com.zhaluo.box.spring.TaskExecutor.TaskExecutorConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskSchedulerConfig.class);

        //context.close(); 容器不能关闭。否者

    }
}
