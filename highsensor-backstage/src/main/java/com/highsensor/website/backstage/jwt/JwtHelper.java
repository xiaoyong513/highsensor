package com.highsensor.website.backstage.jwt;

import com.highsensor.website.backstage.constanst.BaseContextConstants;
import com.highsensor.website.backstage.utils.DateUtils;
import com.highsensor.website.backstage.utils.NumberHelper;
import com.highsensor.website.backstage.utils.StrHelper;
import com.highsensor.website.common.constants.ResultCodeEnum;
import com.highsensor.website.common.exception.HighSensorException;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.time.LocalDateTime;

/**
 * Created by ace on 2017/9/10.
 *
 * @author xiaoma
 * @date 2020/04/24
 */
@Slf4j
public class JwtHelper {

    private static final RsaKeyHelper RSA_KEY_HELPER = new RsaKeyHelper();

    /**
     * 生成用户token
     *
     * @param jwtInfo
     * @param priKeyPath
     * @param expire
     * @return
     * @throws HighSensorException
     */
    public static Token generateUserToken(JwtUserInfo jwtInfo, String priKeyPath, int expire) throws HighSensorException {
        JwtBuilder jwtBuilder = Jwts.builder()
                //设置主题
                .setSubject(String.valueOf(jwtInfo.getUserId()))
                .claim(BaseContextConstants.JWT_KEY_NAME, jwtInfo.getName());
        return generateToken(jwtBuilder, priKeyPath, expire);
    }

    /**
     * 获取token中的用户信息
     *
     * @param token      token
     * @param pubKeyPath 公钥路径
     * @return
     * @throws Exception
     */
    public static JwtUserInfo getJwtFromToken(String token, String pubKeyPath) throws HighSensorException {
        Jws<Claims> claimsJws = parserToken(token, pubKeyPath);
        Claims body = claimsJws.getBody();
        String strUserId = body.getSubject();
        String name = StrHelper.getObjectValue(body.get(BaseContextConstants.JWT_KEY_NAME));
        Integer userId = NumberHelper.intValueOf0(strUserId);
        return new JwtUserInfo(userId,  name);
    }


    /**
     * 生成token
     *
     * @param builder
     * @param priKeyPath
     * @param expire
     * @return
     * @throws HighSensorException
     */
    protected static Token generateToken(JwtBuilder builder, String priKeyPath, int expire) throws HighSensorException {
        try {
            //返回的字符串便是我们的jwt串了
            String compactJws = builder.setExpiration(DateUtils.localDateTime2Date(LocalDateTime.now().plusSeconds(expire)))
                    //设置算法（必须）
                    .signWith(SignatureAlgorithm.RS256, RSA_KEY_HELPER.getPrivateKey(priKeyPath))
                    //这个是全部设置完成后拼成jwt串的方法
                    .compact();
            return new Token(compactJws, expire);
        } catch (IOException | NoSuchAlgorithmException | InvalidKeySpecException e) {
            log.error("errcode:{}, message:{}", ResultCodeEnum.JWT_GEN_TOKEN_FAIL.getCode(), e.getMessage());
            throw new HighSensorException(ResultCodeEnum.JWT_GEN_TOKEN_FAIL);
        }
    }


    /**
     * 公钥解析token
     *
     * @param token
     * @param pubKeyPath 公钥路径
     * @return
     * @throws Exception
     */
    private static Jws<Claims> parserToken(String token, String pubKeyPath) throws HighSensorException {
        try {
            return Jwts.parser().setSigningKey(RSA_KEY_HELPER.getPublicKey(pubKeyPath)).parseClaimsJws(token);
        } catch (ExpiredJwtException ex) {
            //过期
            throw new HighSensorException(ResultCodeEnum.JWT_TOKEN_EXPIRED);
//        } catch (SignatureException ex) {
//            //签名错误
//            throw new HighSensorException(ResultCodeEnum.JWT_SIGNATURE);
        } catch (IllegalArgumentException ex) {
            //token 为空
            throw new HighSensorException(ResultCodeEnum.JWT_ILLEGAL_ARGUMENT);
        } catch (Exception e) {
            log.error("errcode:{}, message:{}", ResultCodeEnum.JWT_PARSER_TOKEN_FAIL.getCode(), e.getMessage());
            throw new HighSensorException(ResultCodeEnum.JWT_PARSER_TOKEN_FAIL);
        }
    }
}
