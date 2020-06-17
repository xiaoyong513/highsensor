package com.highsensor.website.backstage.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.highsensor.website.backstage.dto.auth.UserDTO;
import com.highsensor.website.backstage.entity.User;
import com.highsensor.website.backstage.jwt.JwtTokenServerUtils;
import com.highsensor.website.backstage.jwt.JwtUserInfo;
import com.highsensor.website.backstage.jwt.Token;
import com.highsensor.website.backstage.service.UserService;
import com.highsensor.website.common.constants.ResultCodeEnum;
import com.highsensor.website.common.vo.R;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author changyong
 * @create 2020-04-24 18:32
 */
@Service
@Slf4j
public class AuthManager {

    @Autowired
    private UserService userService;

    @Autowired
    private JwtTokenServerUtils jwtTokenServerUtils;
    /**
     * 超级管理员登录
     * @param name
     * @param password
     * @return
     */
    public R adminLogin(String name, String password) {
        User user = userService.getOne(new QueryWrapper<User>().lambda().eq(User::getName, name));
        if (user == null) {
            log.error("[用户登录] 用户名或者密码不正确");
            return R.setResult(ResultCodeEnum.NAME_OR_PASSWORD_INVALID);
        }
        String md5Hex = DigestUtils.md5Hex(password);
        // 校验密码
        if (!user.getPassword().equalsIgnoreCase(md5Hex)) {
            log.error("[用户登录] 用户名或者密码不正确");
            return R.setResult(ResultCodeEnum.NAME_OR_PASSWORD_INVALID);
        }
        // 生成token
        JwtUserInfo userInfo = new JwtUserInfo(user.getId(), user.getName());

        Token token = jwtTokenServerUtils.generateUserToken(userInfo, null);
        log.info("token={}", token.getToken());
        UserDTO dto = new UserDTO().convertFor(user);
        return R.ok().data("user", dto).data("token", token);
    }

    public JwtUserInfo validateUserToken(String token) {
        JwtUserInfo userInfo = jwtTokenServerUtils.getUserInfo(token);
        return userInfo;
    }

//    public R refresh(String token) {
//        jwtTokenServerUtils.
//    }
}
