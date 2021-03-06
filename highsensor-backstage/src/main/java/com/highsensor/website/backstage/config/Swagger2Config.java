package com.highsensor.website.backstage.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Author: changyong
 * @Date: create in 17:48 2020/2/29
 * @Description:
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {

    @Bean

    public Docket webApiConfig() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("webApi")
                .apiInfo(webApiInfo())
                .select()
                //.paths(Predicates.not(PathSelectors.regex("/admin/.*")))
                //.paths(Predicates.not(PathSelectors.regex("/error.*")))
                .build();
    }

    private ApiInfo webApiInfo() {
        return new ApiInfoBuilder()
                .title("网站后台中心API文档")
                .description("本文档描述了网站后台中心微服务接口定义")
                .version("1.0")
                .contact(new Contact("xiaoma", "http://www.highsensor.com/", "1104672014@qq.com"))
                .build();

    }
}
