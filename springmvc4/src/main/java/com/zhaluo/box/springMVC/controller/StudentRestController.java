package com.zhaluo.box.springMVC.controller;

import com.zhaluo.box.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/rest")
public class StudentRestController {

    @RequestMapping(method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
    public  String restGet(HttpServletRequest request){

        return request.getRequestURI()+ "GET";
    }

    @RequestMapping(value = "getJson" ,method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
    public Student getJSONStudent (HttpServletRequest request) {

        return new Student().setSid(1l).setSname("zhaluo").setSex("男").setAddress("地球");
    }

    @RequestMapping(value = "getXML" , method = RequestMethod.GET,produces = "application/xml;charset=UTF-8")
    public Student getXMLStudent (HttpServletRequest request) {

        return new Student().setSid(1l).setSname("zhaluo").setSex("男").setAddress("地球");
    }

}
