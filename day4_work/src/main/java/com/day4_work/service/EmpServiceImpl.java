package com.day4_work.service;

import com.day4_work.entity.Emp;
import com.day4_work.mapper.EmpMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
@Service
public class EmpServiceImpl implements EmpService{
    @Autowired
    private EmpMapper empMapper;

    @Override
    public int insertEmp(Emp emp) {
        return empMapper.insertEmp(emp);
    }

    @Override
    public int deleteEmp(int id) {
        return empMapper.deleteEmp(id);
    }

    @Override
    public int deleteByCondition(Emp emp) {
        return empMapper.deleteByCondition(emp);
    }

    @Override
    public int updateEmp(Emp emp) {
        return empMapper.updateEmp( emp);
    }

    @Override
    public List<Emp> selectEmp() {
        return empMapper.selectEmp();
    }

    @Override
    public Emp selectById(int id) {
        return empMapper.selectById(id);
    }
}
