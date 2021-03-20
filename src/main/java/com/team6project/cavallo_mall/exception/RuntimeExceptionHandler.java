package com.team6project.cavallo_mall.exception;

import com.team6project.cavallo_mall.vo.RespVo;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import static com.team6project.cavallo_mall.enums.RespStatusAndMsg.*;

/**
 * description:
 * author: Yuchen Bai
 * email: y.bai19@newcastle.ac.uk
 * date: 2021/2/17 16:05
 */
@ControllerAdvice
public class RuntimeExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    // @ResponseStatus(HttpStatus.FORBIDDEN)
    public RespVo handle(RuntimeException e) {
        return RespVo.error(SERVER_ERROR, e.getMessage());
    }

    @ExceptionHandler(UserLoginException.class)
    @ResponseBody
    public RespVo userLoginExceptionHandle() {
        return RespVo.error(NOT_LOGIN);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseBody
    public RespVo methodArgumentNotValidException(MethodArgumentNotValidException e) {
        return RespVo.error(PARAMETER_ERROR, e.getMessage());
    }
}
