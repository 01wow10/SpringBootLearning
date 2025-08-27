package com.day5_work;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.day5_work.entity.User;
import com.day5_work.mapper.UserMapper;
import jakarta.annotation.Resource;
import org.apache.ibatis.annotations.Update;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Day5WorkApplicationTests {
    @Resource
    private UserMapper userMapper;
    @Test
    void contextLoads() {
        List<User> list = userMapper.selectList(null);
        for (User user : list)
            System.out.println(user);
    }
    @Test
    void testUpdate(){
        UpdateWrapper<User> updateWrapper = new UpdateWrapper<>();
        updateWrapper.set("dept_name", "销售部").eq("dept_name", "市场部");
        System.out.println(userMapper.update(null, updateWrapper));
    }
    @Test
    void testUpdate2(){
        UpdateWrapper<User> updateWrapper = new UpdateWrapper<>();
        updateWrapper.set("status", 1)
                .likeRight("addr", "吉林")  // 匹配吉林市（地址以"吉林"开头）
                .or()
                .likeRight("addr", "长春")  // 匹配长春市（地址以"长春"开头）
                .and(wrapper -> wrapper
                        .lt("age", 30)         // 年龄小于30
                        .or()
                        .gt("age", 50)         // 年龄大于50
                );
        System.out.println(userMapper.update(null, updateWrapper));
    }
    @Test
    void testDelete(){
        QueryWrapper<User> deleteWrapper = new QueryWrapper<>();
        deleteWrapper.ge("age", 60)
                .and(wrapper->wrapper.eq("gender", "男"));
        System.out.println(userMapper.delete(deleteWrapper));
    }

}
