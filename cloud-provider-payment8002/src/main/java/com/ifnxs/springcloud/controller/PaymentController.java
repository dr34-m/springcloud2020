package com.ifnxs.springcloud.controller;

import com.ifnxs.springcloud.entities.CommonResult;
import com.ifnxs.springcloud.entities.Payment;
import com.ifnxs.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@Slf4j
@RequestMapping("/payment")
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping("/create")
    public CommonResult create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        log.info("****插入结果****");
        return new CommonResult(200, "success", result);
    }

    @GetMapping("/info/{id}")
    public CommonResult<Payment> create(@PathVariable("id") Integer id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("****查询结果****" + payment);
        return new CommonResult(200, "success" + serverPort, payment);
    }


    @GetMapping(value = "/lb")
    public String getPaymentLB() {
        return serverPort;
    }
}
