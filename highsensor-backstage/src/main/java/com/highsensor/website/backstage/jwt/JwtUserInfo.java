package com.highsensor.website.backstage.jwt;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * jwt 存储的 内容
 *
 * @author xiaoma
 * @date 2020/04/24
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JwtUserInfo implements Serializable {
    /**
     * 账号id
     */
    private Integer userId;

    /**
     * 姓名
     */
    private String name;

}
