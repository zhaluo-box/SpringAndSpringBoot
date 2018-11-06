package com.zhaluo.box.springMVC.Intercept;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * 继承 HandlerInterceptorAdapter来实现自定义的拦截器
 *
 */
public class MyInterceptor extends HandlerInterceptorAdapter {

    /**
     * 在请求执行前 执行
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        long startTime = System.currentTimeMillis();
        request.setAttribute("startTime",startTime);
        return true;
    }


    /**
     * 在请求执行后 执行
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

        Long endTime = System.currentTimeMillis();
        Long start = (Long) request.getAttribute("startTime");
        request.removeAttribute("startTime");
        Long centreTime = endTime - start;

        System.out.println("执行本次任务共用时 : " + centreTime + "豪秒");
    }
}
