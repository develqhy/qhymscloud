package com.sun.springcloud.alibaba.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: qhy
 * @date: 2024-02-05 11:32
 * @description: TODO
 */
@RestController
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/payment/nacos/{id}")
    public String getPaymentInfo(@PathVariable("id") Integer id) {

        log.info("Nacos at 9001...");
        return "9001支付微服务在 Nacos 中注册成功,端口号: "+serverPort+" id: "+id;
    }
}
