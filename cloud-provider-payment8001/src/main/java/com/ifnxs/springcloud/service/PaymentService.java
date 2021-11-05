package com.ifnxs.springcloud.service;

import com.ifnxs.springcloud.dao.PaymentMapper;
import com.ifnxs.springcloud.entities.Payment;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentService {
    @Resource
    private PaymentMapper paymentMapper;

    public int create(Payment payment) {
        return paymentMapper.create(payment);
    }

    public Payment getPaymentById(Integer id) {
        return paymentMapper.getPaymentById(id);
    }
}
