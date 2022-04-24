package com.aut.height.mapper;

import com.aut.height.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;

//@Mapper
public interface UserMapper extends BaseMapper<User> {
}
