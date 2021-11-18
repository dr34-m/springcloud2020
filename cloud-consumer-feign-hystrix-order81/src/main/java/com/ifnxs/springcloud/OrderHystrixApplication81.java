package com.ifnxs.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class OrderHystrixApplication81 {
    public static void main(String[] args) {
        SpringApplication.run(OrderHystrixApplication81.class, args);
    }
}
