package com.sun.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: qhy
 * @date: 2024/2/4 11:51
 * @description: TODO
 */
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@EnableDiscoveryClient
public class ZKOrderMain80 {

    public static void main(String[] args) {
//        System.setProperty("spring.devtools.restart.enabled","false");
        SpringApplication.run(ZKOrderMain80.class,args);
    }
}
