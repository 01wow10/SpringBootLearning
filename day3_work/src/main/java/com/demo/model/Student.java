package com.demo.model;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import java.util.Map;

@Data
public class Student {
    private String name;
    private String gender;
    private int age;
    private Map<String,Integer> scores;
}
