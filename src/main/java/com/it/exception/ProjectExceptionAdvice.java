package com.it.exception;

import com.it.vo.Result;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import static com.it.vo.Code.*;

/**
 * 自定义异常
 */
@RestControllerAdvice
public class ProjectExceptionAdvice {

    @ExceptionHandler(BusinessException.class)
    public Result doBusinessException(BusinessException e) {
        //可能会有到处日志、
        // 发邮件给运维、
        // 发消息给开发
        return new Result(e.getCode(), e.getMessage(), null);
    }

    @ExceptionHandler(SystemException.class)
    public Result doSystemException(SystemException e) {
        //可能会有到处日志、
        // 发邮件给运维、
        // 发消息给开发
        // 给领导发消息
        return new Result(e.getCode(), e.getMessage(), null);
    }

    @ExceptionHandler(Exception.class)
    public Result doBusinessException(Exception e) {
        return new Result(ERROR, "项目出错了", null);
    }
}
