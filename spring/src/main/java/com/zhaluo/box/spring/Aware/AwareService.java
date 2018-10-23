package com.zhaluo.box.spring.Aware;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * BeanNameAware, : Spring 容器中Bean的Name
 * ResourceloaderAware : 获取资源加载器,获取外部文件资源,
 *
 * outputresult 输出获取的文件内容与Bean的名称
 */
@Service
public class AwareService implements BeanNameAware, ResourceLoaderAware {

    private String BeanName;
    private ResourceLoader loader;

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) { //实现resourceLoaderAware 需要实现SetResourceLoader
        this.loader = resourceLoader;
    }

    @Override
    public void setBeanName(String name) { //实现BeanNameAware 需要实现 setBeanName
        this.BeanName = name;
    }


    public void outputResult() {

        System.out.println(" bean的名称 : " + BeanName);

        Resource resource = loader.getResource("classpath:aware/test.txt");

        try {
            System.out.println(" ResourceLoader 加载的文件内容为 ; ➷➷➷➷➷" );
            System.out.println( IOUtils.toString(resource.getInputStream(),"utf-8"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
