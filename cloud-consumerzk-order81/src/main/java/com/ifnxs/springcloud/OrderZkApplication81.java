package com.ifnxs.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class OrderZkApplication81 {
    public static void main(String[] args) {
        SpringApplication.run(OrderZkApplication81.class, args);
    }
}
