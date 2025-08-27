package com.day3_yml_learning.controller;

import com.day3_yml_learning.model.Users;
import jakarta.annotation.Resource;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UsersController {
    @Resource
    private Users users;
    @Resource
    private Environment env;

    @RequestMapping("/get")
    public Users getUsers()
    {
        return users;
    }
    @GetMapping("/env")
    public Object inv(){
        System.out.println(env.getProperty("sysUser"));
        System.out.println(env.getProperty("age"));
        return "hello";
    }

}
