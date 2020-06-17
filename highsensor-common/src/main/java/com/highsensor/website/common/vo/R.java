package com.highsensor.website.common.vo;

import com.highsensor.website.common.constants.ResultCodeEnum;
import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * @author changyong
 * @create 2020-04-24 14:06
 */
@Data
@ApiModel(value = "全局统一返回结果")
public class R {
    private Boolean success;

    private Integer code;

    private String message;

    private Map<String, Object> data = new HashMap<>();

    private R() {
    }


    public static R ok() {
        R r = new R();
        r.setSuccess(ResultCodeEnum.SUCCESS.getSuccess());
        r.setCode(ResultCodeEnum.SUCCESS.getCode());
        r.setMessage(ResultCodeEnum.SUCCESS.getMessage());
        return r;
    }


    public static R error() {
        R r = new R();
        r.setSuccess(ResultCodeEnum.ERROR.getSuccess());
        r.setCode(ResultCodeEnum.ERROR.getCode());
        r.setMessage(ResultCodeEnum.ERROR.getMessage());
        return r;
    }

    public static R setResult(ResultCodeEnum resultCodeEnum){
        R r = new R();
        r.setSuccess(resultCodeEnum.getSuccess());
        r.setCode(resultCodeEnum.getCode());
        r.setMessage(resultCodeEnum.getMessage());
        return r;
    }

    public R success(Boolean success) {
        this.setSuccess(success);
        return this;
    }


    public R message(String message) {
        this.setMessage(message);
        return this;
    }


    public R code(Integer code) {
        this.setCode(code);
        return this;
    }


    public R data(String key, Object value) {
        this.data.put(key, value);
        return this;
    }


    public R data(Map<String, Object> map) {
        this.setData(map);
        return this;
    }
}
