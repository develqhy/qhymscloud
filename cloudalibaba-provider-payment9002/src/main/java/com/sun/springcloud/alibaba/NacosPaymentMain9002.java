package com.sun.springcloud.alibaba;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: qhy
 * @date: 2024-02-05 12:36
 * @description: TODO
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan(basePackages = "com.sun.springcloud.alibaba.mapper")
public class NacosPaymentMain9002 {

    public static void main(String[] args) {
        SpringApplication.run(NacosPaymentMain9002.class,args);
    }
}
