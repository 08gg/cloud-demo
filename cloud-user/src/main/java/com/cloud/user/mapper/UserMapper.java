package com.cloud.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cloud.user.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper extends BaseMapper<User> {
    @Select("select * from user where id = #{id}")
    User find(@Param("id") Integer id);
}
