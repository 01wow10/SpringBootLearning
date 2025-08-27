package com.day4_work.entity;

import io.swagger.annotations.ApiModel;
import lombok.Data;

@Data
@ApiModel(description = "员工信息")
public class Emp {
    private int id;
    private String name;
    private String addr;
    private String dept;
    private int age;
}
