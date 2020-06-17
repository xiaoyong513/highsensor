package com.highsensor.website.backstage.init;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.highsensor.website.backstage.entity.User;
import com.highsensor.website.backstage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * @author changyong
 * @create 2020-04-24 19:44
 */
@Component
//如果有多个这样的类时，可以通过Order指定执行顺序，数值越小执行优先级越高
@Order(value = 0)
public class Init implements CommandLineRunner, EnvironmentAware {

    @Autowired
    private UserService userService;

    @Override
    public void run(String... args) throws Exception {
        userService.createAdmin();
    }

    @Override
    public void setEnvironment(Environment environment) {

    }
}
