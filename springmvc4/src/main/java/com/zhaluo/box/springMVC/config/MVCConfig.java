package com.zhaluo.box.springMVC.config;


import com.zhaluo.box.springMVC.Intercept.MyInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 * 继承 WebMvcConfigurerAdapter对spring MVC进行配置
 *
 */

@Configuration  //声明这是一个配置类
@ComponentScan("com.zhaluo.box.springMVC") //包扫描
@EnableWebMvc  //开启MVC配置
public class MVCConfig extends WebMvcConfigurerAdapter {

    /**
     *  对视图进行配置
     * @return
     */
    @Bean
    public InternalResourceViewResolver viewResolver(){

        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();

        viewResolver.setPrefix("/WEB-INF/classes/views/");
        viewResolver.setSuffix(".jsp");
        viewResolver.setViewClass(JstlView.class);
        return viewResolver;
    }


    /**
     * addResourceHandler 文件存放的位置
     * addResourceLocations 文件对外暴露的位置[编译后的位置]
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/js/**").addResourceLocations("classpath:/js/");
    }

    /**
     * 配置自定义拦截器
     * @return
     */
    @Bean
    public MyInterceptor myInterceptor(){
        return  new MyInterceptor();
    }


    /**
     * 优化页面跳转
     * @param registry
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
       registry.addViewController("/index").setViewName("/index");
    }

    /**
     * 重写addInterceptors 方法 注册拦截器
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(myInterceptor());
    }

    /**
     * 重写configurePathMatch  不忽略 " . " 后面的参数
     * @param configurer
     */
    @Override
    public void configurePathMatch(PathMatchConfigurer configurer) {
        configurer.setUseSuffixPatternMatch(false);
    }
}
