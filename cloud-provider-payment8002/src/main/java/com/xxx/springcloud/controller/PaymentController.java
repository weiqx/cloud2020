package com.xxx.springcloud.controller;
// 2021-11

import com.xxx.springcloud.entities.CommonResult;
import com.xxx.springcloud.entities.Payment;
import com.xxx.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService; // 这种注入方式只有唯一一个实现类吗？？？

    @Value("${server.port}")
    private String serverPort;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        log.info("******插入结果：" + result);

        if (result > 0){
            return new CommonResult(200, "插入数据库成功, serverPort:" + serverPort, result);
        } else {
            return new CommonResult(444, "插入数据库失败, serverPort:" + serverPort, null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("******查询成功：" + payment + "devtools");

        int i = 10;
        System.out.println(i);

        if (payment != null){
            return new CommonResult(200, "查询成功, serverPort:" + serverPort, payment);
        } else {
            return new CommonResult(444, "没有对应记录，查询ID", null);
        }
    }

    @GetMapping(value = "/payment/lb")
    public String getPaymentLB()
    {
        return serverPort;
    }
}
