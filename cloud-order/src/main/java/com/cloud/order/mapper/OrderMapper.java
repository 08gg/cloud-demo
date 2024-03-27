package com.cloud.order.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cloud.order.pojo.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface OrderMapper extends BaseMapper<Order> {
    @Select("select * from order where id = #{id}")
    Order find(@Param("id") Integer id);
}
