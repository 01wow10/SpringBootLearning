package com.day5_work.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @TableId(type = IdType.AUTO)
    private int id;
    private String empName;
    @TableField(select = false)
    private String loginName;
    @TableField(select = false)
    private String loginPassword;
    private int age;
    private String gender;
    private String addr;
    private String deptName;
    private int status;
    private int deleted;
}
