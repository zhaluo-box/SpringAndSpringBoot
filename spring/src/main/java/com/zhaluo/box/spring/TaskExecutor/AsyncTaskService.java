package com.zhaluo.box.spring.TaskExecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
    @Async
        类级别 ： 表示类中所有方法都是异步的
        方法级别： 表示 此方法是异步的
 */
@Service
public class AsyncTaskService {

    @Async //标识这是一个异步方法
    public void executeAsyncTask(Integer i) {

        System.out.println(" 执行异步任务 " + i);

    }

    @Async
    public void executeAsyncTaskPlus(Integer i) {

        System.out.println("执行异步任务+1 :" + (i + 1));

    }


}
