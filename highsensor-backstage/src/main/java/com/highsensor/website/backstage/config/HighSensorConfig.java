package com.highsensor.website.backstage.config;

import com.baomidou.mybatisplus.core.injector.ISqlInjector;
import com.baomidou.mybatisplus.extension.injector.LogicSqlInjector;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.highsensor.website.backstage.jwt.JwtTokenServerUtils;
import com.highsensor.website.backstage.properties.AuthServerProperties;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Author: changyong
 * @Date: create in 14:57 2020/2/29
 * @Description:
 */
@Configuration
@EnableConfigurationProperties(value = {
        AuthServerProperties.class,
})
@EnableTransactionManagement
@MapperScan("com.highsensor.website.backstage.mapper")
public class HighSensorConfig {

    @Bean
    public ISqlInjector sqlInjector() {
        return new LogicSqlInjector();
    }

    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }

    @Bean
    public JwtTokenServerUtils getJwtTokenServerUtils(AuthServerProperties authServerProperties) {
        return new JwtTokenServerUtils(authServerProperties);
    }
}
