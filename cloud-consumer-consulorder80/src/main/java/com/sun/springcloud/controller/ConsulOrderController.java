package com.sun.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author: qhy
 * @date: 2024/2/4 17:04
 * @description: TODO
 */
@RestController
@Slf4j
public class ConsulOrderController {

    public static final String INVOKE_URL = "http://cloud-provider-consul-payment";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value = "/consumer/payment/consul")
    public String getPaymentByConsul() {

        log.info("Consul作为注册中心,80调用8006...");
        return restTemplate.getForObject(INVOKE_URL + "/payment/consul", String.class);
    }
}
