package com.day3_yml_learning.model;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Data
@Component
@ConfigurationProperties(prefix = "com.model.users")
public class Users {
    private String name;
    private String gender;
    private int age;
    private double money;
    private LocalDate birth;
    private List<String> likes;
    private List<Integer>list;
    private List<String>list1;
}
