package com.highsensor.website.common.exception;

import com.highsensor.website.common.constants.ResultCodeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author changyong
 * @create 2020-04-24 14:31
 */
@Data
@ApiModel(value = "项目异常")
public class HighSensorException extends RuntimeException{

    @ApiModelProperty(value = "状态码")
    private Integer code;

    public HighSensorException(String message) {
        super(message);
    }

    /**
     * 接收状态码
     * @param message
     * @param code
     */
    public HighSensorException(String message, Integer code) {
        super(message);
        this.code = code;
    }

    /**
     * 接收枚举类型
     * @param resultCodeEnum
     */
    public HighSensorException(ResultCodeEnum resultCodeEnum) {
        super(resultCodeEnum.getMessage());
        this.code = resultCodeEnum.getCode();
    }

    @Override
    public String toString() {
        return "HighSensorException{" +
                "message=" + this.getMessage() +
                ", code=" + code +
                "} ";
    }
}
