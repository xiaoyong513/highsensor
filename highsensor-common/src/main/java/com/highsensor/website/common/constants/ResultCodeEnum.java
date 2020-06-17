package com.highsensor.website.common.constants;

import javafx.scene.input.KeyCodeCombination;
import lombok.Getter;

/**
 * @author changyong
 * @create 2020-04-24 14:06
 */
@Getter
public enum ResultCodeEnum {
    /**
     * 项目公用错误码 20000~20099
     */
    SUCCESS(true, 20000,"成功"),
    ERROR(false, 20001, "失败"),


    /**
     * 用户登录 20100-20199
     */
    NAME_OR_PASSWORD_INVALID(false, 20100, "用户名或者密码不正确"),

    /**
     * 生成token 20200-20299
     */

    JWT_GEN_TOKEN_FAIL(false, 20200, "生成token失败"),
    JWT_TOKEN_EXPIRED(false, 20201, "token已过期"),
    JWT_SIGNATURE(false, 20202, "签名错误"),
    JWT_ILLEGAL_ARGUMENT(false, 20203, "token为空"),
    JWT_PARSER_TOKEN_FAIL(false, 20204, "解析token失败"),
    ;
    private Boolean success;

    private Integer code;

    private String message;

    ResultCodeEnum(Boolean success, Integer code, String message) {
        this.success = success;
        this.code = code;
        this.message = message;
    }
}


