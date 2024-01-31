package com.sun.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 访问地址：http://localhost:8001/doc.html
 */
@Deprecated
//@Configuration
//@EnableSwagger2
//@EnableWebMvc
public class Knife4jConfig {

//    @Bean(value = "docketBean")
    public Docket docketBean() {
        //指定使用Swagger2规范
        return new Docket(DocumentationType.SWAGGER_2)
            .apiInfo(new ApiInfoBuilder()
                .title("XXX项目API接口文档")
                //描述字段支持Markdown语法
                .description("# Knife4j RESTful APIs...")
                .termsOfServiceUrl("http://www.xxx.com/")
                .contact(new Contact("sun", "com.sun","8888@sunmail.com"))
                .version("v1.0")
                .build())
            //分组名称
            .groupName("XX信息服务")
            .select()
            //这里指定Controller扫描包路径 可以指定某一个包 是绝对路径
            .apis(RequestHandlerSelectors.basePackage("com.sun.springcloud.controller"))
            // 扫面所有包
//            .apis(RequestHandlerSelectors.any())
            .paths(PathSelectors.any())
            .build();
    }
}
