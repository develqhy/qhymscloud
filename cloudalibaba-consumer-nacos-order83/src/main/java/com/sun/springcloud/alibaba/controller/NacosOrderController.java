package com.sun.springcloud.alibaba.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author: qhy
 * @date: 2024-02-05 13:06
 * @description: TODO
 */
@RestController
@Slf4j
public class NacosOrderController {

    @Resource
    private RestTemplate restTemplate;

    @Value("${server-url.nacos-user-service}")
    private String serverURL;

    @GetMapping(value = "/consumer/payment/nacos/{id}")
    public String getPaymentInfo(@PathVariable("id") Integer id) {

        log.info("83调用9001和9002...OK");
        return restTemplate.getForObject(serverURL+"/payment/nacos/"+id,String.class);
    }
}
