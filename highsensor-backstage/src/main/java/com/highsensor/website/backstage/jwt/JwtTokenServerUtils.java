package com.highsensor.website.backstage.jwt;

import com.highsensor.website.backstage.properties.AuthServerProperties;
import com.highsensor.website.common.exception.HighSensorException;
import lombok.AllArgsConstructor;

/**
 * jwt token 工具
 *
 * @author xiaoma
 * @date 2020/04/24
 */
@AllArgsConstructor
public class JwtTokenServerUtils {
    /**
     * 认证服务端使用，如 authority-server
     * 生成和 解析token
     */
    private AuthServerProperties authServerProperties;

    /**
     * 生成token
     *
     * @param jwtInfo
     * @param expire
     * @return
     * @throws HighSensorException
     */
    public Token generateUserToken(JwtUserInfo jwtInfo, Integer expire) throws HighSensorException {
        AuthServerProperties.TokenInfo userTokenInfo = authServerProperties.getUser();
        if (expire == null || expire <= 0) {
            expire = userTokenInfo.getExpire();
        }
        return JwtHelper.generateUserToken(jwtInfo, userTokenInfo.getPriKey(), expire);
    }

    /**
     * 解析token
     *
     * @param token
     * @return
     * @throws HighSensorException
     */
    public JwtUserInfo getUserInfo(String token) throws HighSensorException {
        AuthServerProperties.TokenInfo userTokenInfo = authServerProperties.getUser();
        return JwtHelper.getJwtFromToken(token, userTokenInfo.getPubKey());
    }
}
