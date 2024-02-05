package com.sun.springcloud.alibaba;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: qhy
 * @date: 2024-02-05 11:27
 * @description: TODO
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan(basePackages = "com.sun.springcloud.alibaba.mapper")
public class NacosPaymentMain9001 {

    public static void main(String[] args) {
        SpringApplication.run(NacosPaymentMain9001.class, args);
    }
}
