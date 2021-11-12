package com.ifnxs.springcloud.service;

import com.ifnxs.springcloud.entities.CommonResult;
import com.ifnxs.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {

    @GetMapping("/payment/info/{id}")
    CommonResult<Payment> getPaymentById(@PathVariable("id") Integer id);

    @GetMapping("/payment/feign/timeout")
    public String paymentFeignTimeout();
}
