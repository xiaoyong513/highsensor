package com.highsensor.website.backstage.controller;

import com.highsensor.website.backstage.dto.auth.LoginParamDTO;
import com.highsensor.website.backstage.jwt.JwtUserInfo;
import com.highsensor.website.backstage.service.impl.AuthManager;
import com.highsensor.website.common.exception.HighSensorException;
import com.highsensor.website.common.vo.R;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author changyong
 * @create 2020-04-24 16:51
 */
@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthManager authManager;
    /**
     * 管理员登录后台系统
     * @param login
     * @return
     */
    @ApiOperation(value = "超级管理员登录", notes = "超级管理员登录")
    @PostMapping("/admin/login")
    public R adminLogin(@Validated @RequestBody LoginParamDTO login) {
        return authManager.adminLogin(login.getName(), login.getPassword());
    }


    /**
     * 验证token
     *
     * @param token
     * @return
     * @throws Exception
     */
    @ApiOperation(value = "验证token", notes = "验证token")
    @GetMapping(value = "/verify-token")
    public R verify(@RequestParam(value = "token") String token) throws HighSensorException {
        JwtUserInfo jwtUserInfo = authManager.validateUserToken(token);
        return R.ok().data("userInfo", jwtUserInfo);
    }

}
