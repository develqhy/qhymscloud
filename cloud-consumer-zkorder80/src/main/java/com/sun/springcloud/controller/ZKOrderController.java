package com.sun.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author: qhy
 * @date: 2024/2/4 11:56
 * @description: TODO
 */
@RestController
@Slf4j
public class ZKOrderController {

    public static final String INVOKE_URL = "http://cloud-provider-zkpayment";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value = "/consumer/payment/zk")
    public String getPaymentInfo() {

        log.info("Zookeeper作为注册中心,80调用8004...");
        return restTemplate.getForObject(INVOKE_URL + "/payment/zk", String.class);
    }
}
