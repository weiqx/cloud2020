package com.xxx.springcloud.alibaba.controller;
//2021-12-1

import com.xxx.springcloud.alibaba.domain.CommonResult;
import com.xxx.springcloud.alibaba.domain.Order;
import com.xxx.springcloud.alibaba.servcie.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class OrderController {

    @Resource
    private OrderService orderService;

    @GetMapping("/order/create")
    public CommonResult create(Order order){
        orderService.create(order);
        return new CommonResult(200, "订单创建成功");
    }
}
