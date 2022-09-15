package com.jianping5.usercenter.exception;

import com.jianping5.usercenter.common.BaseResponse;
import com.jianping5.usercenter.common.ErrorCode;
import com.jianping5.usercenter.common.ResultUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局异常处理器
 *
 * @author jianping5
 * @create 2022/8/4 15:07
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(BusinessException.class)
    public BaseResponse businessExceptionHandler(BusinessException e) {
        log.error("businessException：" + e.getMessage(), e);
        return ResultUtils.error(e.getCode(), e.getMessage(), e.getDescription());
    }

    @ExceptionHandler(RuntimeException.class)
    public BaseResponse runtimeExceptionHandler(BusinessException e) {
        log.error("runtimeException", e);
        return ResultUtils.error(ErrorCode.SYSTEM_ERROR, e.getMessage(), "");
    }
}
