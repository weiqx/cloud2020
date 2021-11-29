package com.xxx.springcloud.service.impl;
// 2021-11

import com.xxx.springcloud.dao.PaymentDao;
import com.xxx.springcloud.entities.Payment;
import com.xxx.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource  // java自带的。  autowird  spring的
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
