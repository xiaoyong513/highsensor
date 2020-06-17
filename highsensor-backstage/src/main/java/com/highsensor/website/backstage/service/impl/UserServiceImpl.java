package com.highsensor.website.backstage.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.highsensor.website.backstage.entity.User;
import com.highsensor.website.backstage.mapper.UserMapper;
import com.highsensor.website.backstage.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author changyong
 * @since 2020-04-24
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Override
    public void createAdmin() {
        if (!nameIsExist("admin")) {
            User user = new User();
            user.setName("admin").setPassword(DigestUtils.md5Hex("admin")).setNickname("超级管理员");
            baseMapper.insert(user);
        }
    }

    public boolean nameIsExist(String name) {
        return baseMapper.selectOne(new QueryWrapper<User>().lambda().eq(User::getName, name)) != null;
    }

}
