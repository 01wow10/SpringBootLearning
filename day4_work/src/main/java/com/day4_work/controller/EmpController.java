package com.day4_work.controller;

import com.day4_work.entity.Emp;
import com.day4_work.service.EmpService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/emp")
@Api(tags = "员工管理")
public class EmpController {
    @Resource
    private EmpService empService;
    @PostMapping("/insertEmp")
    @ApiOperation("添加员工")
    public int insertEmp(Emp emp){
        return empService.insertEmp(emp);
    }
    @PostMapping("/deleteEmp")
    @ApiOperation("删除员工")
    public int deleteEmp(int id){
        return empService.deleteEmp(id);
    }
    @PostMapping("/deleteByCondition")
    @ApiOperation("根据所给信息删除员工")
    public int deleteByCondition(Emp emp){
        return empService.deleteByCondition(emp);
    }
    @PostMapping("/updateEmp")
    @ApiOperation("更新员工信息")
    public int updateEmp(Emp emp){
        return empService.updateEmp(emp);
    }
    @PostMapping("/selectEmp")
    @ApiOperation("查询所有员工")
    public List<Emp> selectEmp(){
        return empService.selectEmp();
    }
    @PostMapping("/selectEmpAndPaging")
    @ApiOperation("分页查询所有员工")
    public List<Emp> selectEmpAndPaging(){
        PageHelper.startPage(1,5);
        List<Emp> list=empService.selectEmp();
        PageInfo<Emp> pageInfo=new PageInfo<>(list);
        return pageInfo.getList();
    }
    @PostMapping("/selectById")
    @ApiOperation("根据id查询员工")
    public Emp selectById(int id){
        return empService.selectById(id);
    }
    @PostMapping("/selectByConditionPaging/{start}/{size}")
    @ApiOperation("根据所给信息分页查询员工")
    public List<Emp> selectByConditionPaging(@PathVariable int start, @PathVariable int size){
        PageHelper.startPage(start,size);
        List<Emp> list=empService.selectEmp();
        PageInfo<Emp> pageInfo=new PageInfo<>(list);
        return pageInfo.getList();
    }
}
