package com.highsensor.website.backstage.service;

import com.highsensor.website.backstage.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author changyong
 * @since 2020-04-24
 */
public interface UserService extends IService<User> {

    /**
     * 创建超级管理员
     */
    void createAdmin();

    /**
     * 名字是否存在
     */
    boolean nameIsExist(String name);
}
