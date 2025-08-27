package com.day4_work.service;

import com.day4_work.entity.Emp;
import com.day4_work.mapper.EmpMapper;
import org.springframework.stereotype.Service;

import java.util.List;


public interface EmpService {
    int insertEmp(Emp emp);
    int deleteEmp(int id);
    int deleteByCondition(Emp emp);
    int updateEmp(Emp emp);
    List<Emp> selectEmp();
    Emp selectById(int id);
}
