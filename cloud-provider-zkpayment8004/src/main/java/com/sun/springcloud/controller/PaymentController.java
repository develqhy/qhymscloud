package com.sun.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author: qhy
 * @date: 2024/2/4 9:39
 * @description: TODO
 */
@RestController
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/payment/zk")
    public String getPaymentInfo() {

        log.info("8004整合Zookeeper注册中心已经开始了");
        return "Spring Cloud with Zookeeper: "+serverPort+" "+ UUID.randomUUID();
    }
}
