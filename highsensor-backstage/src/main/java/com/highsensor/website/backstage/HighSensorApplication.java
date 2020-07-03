package com.highsensor.website.backstage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author changyong
 * @create 2020-04-24 14:49
 */
@SpringBootApplication
@MapperScan({"com.gitee.sunchenbin.mybatis.actable.dao.*"} )
@ComponentScan({"com.highsensor.website.backstage.*","com.gitee.sunchenbin.mybatis.actable.manager.*"})
public class HighSensorApplication {
    public static void main(String[] args) {
        SpringApplication.run(HighSensorApplication.class, args);
    }
}
