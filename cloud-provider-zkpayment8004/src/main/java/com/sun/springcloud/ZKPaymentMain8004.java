package com.sun.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author qhy
 * @create 2024/2/4 9:10
 */
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@EnableDiscoveryClient
//@MapperScan(basePackages = "com.sun.springcloud.mapper")
public class ZKPaymentMain8004 {

    public static void main(String[] args) {

//        System.setProperty("spring.devtools.restart.enabled","false");
        SpringApplication.run(ZKPaymentMain8004.class,args);
    }
}
