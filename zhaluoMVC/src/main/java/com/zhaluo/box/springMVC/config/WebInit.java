package com.zhaluo.box.springMVC.config;


import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

public class WebInit implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {

        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();

        context.register(MVCConfig.class);
        context.setServletContext(servletContext);

        Dynamic dispatcher = servletContext.addServlet("dispatcher", new DispatcherServlet(context));

        dispatcher.setLoadOnStartup(1);
        dispatcher.addMapping("/");
    }
}
