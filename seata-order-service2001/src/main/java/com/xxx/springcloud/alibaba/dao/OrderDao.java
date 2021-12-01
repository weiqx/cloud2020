package com.xxx.springcloud.alibaba.dao;
//2021-12-1

import org.apache.ibatis.annotations.Mapper;
import com.xxx.springcloud.alibaba.domain.Order;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OrderDao
{
    //1 新建订单
    void create(Order order);

    //2 修改订单状态，从零改为1
    void update(@Param("userId") Long userId,@Param("status") Integer status);
}

