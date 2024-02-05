package com.sun.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: qhy
 * @date: 2024-02-05 13:01
 * @description: TODO
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableDiscoveryClient
public class NacosOrderMain83 {

    public static void main(String[] args) {
        SpringApplication.run(NacosOrderMain83.class,args);
    }
}
