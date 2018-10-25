package com.zhaluo.box.spring.test;


import com.zhaluo.box.entity.TestEntity;
import com.zhaluo.box.spring.Test.TestConfig;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class) //Junit环境下提供TestContext framework 功能
@ContextConfiguration(classes = {TestConfig.class}) //加载配置类
@ActiveProfiles("prod")    //声明测试的环境
public class TestDemo1 {

    @Autowired
    private TestEntity entity;

    @Test
    public void prodEntityTest(){
        String name = "prod";
        String name2 = entity.getName();
        System.out.println("================美丽的分割线===========");
        Assert.assertEquals(name,name2);
    }

}
