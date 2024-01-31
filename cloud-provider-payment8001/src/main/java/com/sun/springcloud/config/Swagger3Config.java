package com.sun.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @author qhy
 * @create 2024/1/31 17:07
 * 访问地址：http://localhost:8001/doc.html
 * 访问地址：http://localhost:8001/swagger-ui/index.html
 */

@Configuration
@EnableOpenApi
public class Swagger3Config {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.OAS_30)
            .apiInfo(apiInfo())
            .select()
            .apis(RequestHandlerSelectors.basePackage("com.sun.springcloud.controller"))
            .paths(PathSelectors.any())
            .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
            .title("XXX系统RESTful API文档").description("XXX系统RESTful API文档...")
            .contact(new Contact("qhy","www.qhy.com","666@qhy.com"))
            .termsOfServiceUrl("")
            .version("v1.0")
            .build();
    }
}
