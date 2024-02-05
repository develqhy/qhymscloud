package com.sun.springcloud.alibaba.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: qhy
 * @date: 2024-02-05 14:31
 * @description: TODO
 */
@RestController
@Slf4j
@RefreshScope   // Nacos的动态刷新支持
public class NacosConfigClientController {

    @Value("${config.info}")
    private String nacosConfigInfo;

    @GetMapping(value = "/config/info")
    public String getNacosConfigInfo() {

        log.info("等待Nacos配置中心初始化完成...OK");
        return nacosConfigInfo;
    }

}
