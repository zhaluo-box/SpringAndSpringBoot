package com.zhaluo.box.springMVC.controller;


import org.springframework.stereotype.Controller;

import com.zhaluo.box.entity.Student;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * 传统controller 演示
 *
 * @RequestMapping produces : 指定返回的媒体类型和字符集
 */
@Controller
@RequestMapping("/student")
public class StudentController {


    /**
     * 演示返回媒体类型
     * @param request
     * @return
     */
    @RequestMapping(produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String index(HttpServletRequest request) {

        return "url" + request.getRequestURI() + "remote" + request.getRemoteAddr();
    }


    /**
     * 演示在路径上携带参数 pathvariable
     * @param str
     * @param request
     * @return
     */
    @RequestMapping(value = "/pathvar/{str}", produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String studentPathVar(@PathVariable String str, HttpServletRequest request) {

        return "url : " + request.getRequestURI() + " PathVariable : " + str;
    }

    /**
     * 演示基本参数类型的映射
     * @param id
     * @param request
     * @return
     */
    @RequestMapping(value = "/passRequestParam", produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String passRequestParam(Long id, HttpServletRequest request) {

        return "url : " + request.getRequestURI() + "常规参数获取 : " + id;
    }

    /**
     * 演示接受实体类
     * @param student
     * @param request
     * @return
     */
    @RequestMapping(value = "/entityParam", produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String entityParam(Student student, HttpServletRequest request) {

        return "remote : " + request.getRemoteAddr() + student.toString();
    }

    /**
     * 演示不同路径 映射同一请求
     * @param request
     * @return
     */
    @RequestMapping(value = {"/path1", "/path2"}, produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String path1andPath2(HttpServletRequest request) {

        return "url" + request.getContextPath().toString() + "1 :" + request.getRequestURI();
    }

}

