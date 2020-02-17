package com.itheima.exception;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


/**
 * 功能描述：
 *
 * @author wcx
 * @version 1.0
 */
@ControllerAdvice
public class HandlerControllerAdvice {

    @ExceptionHandler(AccessDeniedException.class)
    public String handlerException() {
        return "forward:/403.jsp";
    }

    @ExceptionHandler(RuntimeException.class)
    public String runtimeHandlerException() {
        return "forward:/500.jsp";
    }
}
