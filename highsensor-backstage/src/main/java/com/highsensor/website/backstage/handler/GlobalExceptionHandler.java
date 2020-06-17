package com.highsensor.website.backstage.handler;

import com.highsensor.website.common.exception.HighSensorException;
import com.highsensor.website.common.vo.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author xiaoma
 * @create 2020-04-24 14:01
 */
@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public R error(Exception e){
        log.debug("[全局异常]", e);
        return R.error();
    }

    @ExceptionHandler(HighSensorException.class)
    @ResponseBody
    public R highSensorException(HighSensorException e) {
        log.debug(e.toString());
        return R.error().code(e.getCode()).message(e.getMessage());
    }
}
