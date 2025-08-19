package com.day2_work.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "学生对象", description = "对应数据库表student")
public class Student {
    @ApiModelProperty(value = "学生id", required = true, example = "1")
    private int id;
    @ApiModelProperty(value = "学生姓名", required = true, example = "张三")
    private String name;
    @ApiModelProperty(value = "学生性别", required = true, example = "男")
    private String gender;
    @ApiModelProperty(value = "学生年龄", required = true, example = "18")
    private int age;
}
