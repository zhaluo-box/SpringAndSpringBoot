package com.zhaluo.box.entity;


import java.io.Serializable;

public class Student implements Serializable {

    private Long sid;

    private String sname;

    private String sex;

    private String address;


    public Student(Long sid, String sname, String sex, String address) {
        this.sid = sid;
        this.sname = sname;
        this.sex = sex;
        this.address = address;
    }

    public Student() {
    }

    public Long getSid() {
        return sid;
    }

    public void setSid(Long sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
