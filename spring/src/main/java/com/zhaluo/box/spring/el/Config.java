package com.zhaluo.box.spring.el;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

@Configuration
@ComponentScan("com.zhaluo.box.spring.el")
@PropertySource({"classpath:el/eltest.properties"})
public class Config {

    //注入配置文件中的属性
    @Value("${name}")
    private String name;

    @Value("${sex}")
    private String sex;

    @Value("${address}")
    private String address;

    //注入普通属性
    @Value("13115018312")
    private String tel;

    //注入操作系统属性
    @Value("#{systemProperties['os.name']}")
    private String OsProperties;

    //注入其他 bean的属性, 注意这个地方 demoService-->也就是类名一定要首字符小写,不然会报错.Property or field 'DemoService' cannot be found on object of type
    @Value("#{demoService.another}")
    private String beautifulGril;

    //注入文件资源和网址资源 是没有占位符
    @Value("classpath:el/eltest.properties")
    private Resource testFile;

    //注入网址资源
    @Value("http://www.baidu.com")
    private Resource url;

    //注入表达式结果
    @Value("#{ T(java.lang.Math).random() * 100.0 }")
    private double randomNumber;

    @Autowired
    private Environment environment;

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigure() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    public void outputResource() {

        try {

            System.out.println(name);
            System.out.println(OsProperties);
            System.out.println(tel);
            System.out.println(randomNumber);
            System.out.println("=======================");
            System.out.println(IOUtils.toString(testFile.getInputStream()));
            System.out.println("=======================");
            System.out.println(IOUtils.toString(url.getInputStream()));
            System.out.println("=======================");
            System.out.println(environment.getProperty("address"));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
