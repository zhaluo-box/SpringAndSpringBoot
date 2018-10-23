package com.zhaluo.box.spring.Scheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class ScheduledService {
    private static final SimpleDateFormat dateformate = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 2000)
    public void reportCurrentTime() {
        System.out.println(" 每隔5秒执行一次 " + dateformate.format(new Date()));
    }

    @Scheduled(cron = "0 1 15 ? * *")
    public void fixTimeExecution(){
        System.out.println("在指定时间 " + dateformate.format(new Date()) + "执行");
    }
}
