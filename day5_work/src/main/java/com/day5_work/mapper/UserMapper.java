package com.day5_work.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.day5_work.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
