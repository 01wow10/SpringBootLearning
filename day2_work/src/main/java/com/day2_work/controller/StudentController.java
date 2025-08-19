package com.day2_work.controller;

import com.day2_work.model.Student;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/student")
@Api(tags = {"学生管理"})//用在对类的请求上，对类进行说明，tags表明该类的作用
public class StudentController {
    @GetMapping
    @ApiOperation(value = "显示全部学生数据")//用在对方法上，对请求进行说明
    public Object list(){
        List<Student> list = new ArrayList<>();
        list.add(new Student(1,"张三","男",18));
        list.add(new Student(2,"李四","女",19));
        list.add(new Student(3,"王五","男",20));
        return list;
    }
    @GetMapping("/{id}")
    @ApiOperation(value = "查询学生数据")
    public Object get(@ApiParam(value = "学生id") @PathVariable int id){
        return "查询id为"+id+"的学生";
    }
    @DeleteMapping("/{id}")
    @ApiOperation(value = "删除学生数据")
    public Object delete(@ApiParam(value = "学生id") @PathVariable int id){
        return "删除id为"+id+"的学生";
    }
    @PostMapping
    @ApiOperation(value = "添加学生数据")
    public Object add(@ApiParam(value = "学生对象") @RequestBody Student student){
        return "添加了学生"+student.getName();
    }
    @PutMapping
    @ApiOperation(value = "修改学生数据")
    public Object update(@ApiParam(value = "学生对象") @RequestBody Student student){
        return "修改了id为"+student.getId()+"的学生";
    }

}
