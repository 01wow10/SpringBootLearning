package com.day3_yml_learning.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    @Value("${sysUser}")
    private String sysUser;
    @Value("${age}")
    private int age;
    @RequestMapping("/get")
    public String get(){
        return "sysUser:"+sysUser+" age:"+age;
    }
}
