package com.atguigu.exam.exceptionhandles;

import com.atguigu.exam.common.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public Result exceptionHandler(Exception e) {
        e.printStackTrace();
        log.error("异常信息为:{}", e.getMessage());
        return Result.error(e.getMessage());
    }
    // 业务异常
    @ExceptionHandler(RuntimeException.class)
    public Result<String> handleRuntimeException(RuntimeException e) {
        log.error("业务异常：{}", e.getMessage());
        return Result.error(e.getMessage());
    }

    // JWT异常
    @ExceptionHandler(io.jsonwebtoken.JwtException.class)
    public Result<String> handleJwtException(io.jsonwebtoken.JwtException e) {
        log.error("JWT异常：{}", e.getMessage());
        return Result.error("账号异常");
    }

    // 系统异常
    @ExceptionHandler(Exception.class)
    public Result<String> handleException(Exception e) {
        log.error("系统异常：", e);
        return Result.error("服务器内部错误");
    }
}
