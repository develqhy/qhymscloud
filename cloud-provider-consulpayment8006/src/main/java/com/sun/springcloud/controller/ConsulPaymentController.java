package com.sun.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author: qhy
 * @date: 2024/2/4 16:16
 * @description: TODO
 */
@RestController
@Slf4j
public class ConsulPaymentController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/payment/consul")
    public String paymentByConsul() {

        log.info("8006整合Consul注册中心已经开始了");
        return "Spring Cloud with Consul: "+serverPort+" "+ UUID.randomUUID();
    }
}
