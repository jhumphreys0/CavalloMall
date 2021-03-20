package com.team6project.cavallo_mall.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.team6project.cavallo_mall.enums.RespStatusAndMsg;
import lombok.Data;
import org.springframework.validation.BindingResult;

import java.util.Objects;

/**
 * description:
 * author: Yuchen Bai
 * email: y.bai19@newcastle.ac.uk
 * date: 2021/2/17 0:41
 */
@Data
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class RespVo<T> {

    private Integer status;

    private String msg;

    private T data;

    private RespVo(Integer status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    private RespVo(Integer status, T data) {
        this.status = status;
        this.data = data;
    }

    public static <T> RespVo<T> success(T data) {
        return new RespVo<T>(RespStatusAndMsg.SUCCESS.getCode(), data);
    }

    public static <T> RespVo<T> success() {
        return new RespVo<T>(RespStatusAndMsg.SUCCESS.getCode(), RespStatusAndMsg.SUCCESS.getDesc());
    }

    public static <T> RespVo<T> error(RespStatusAndMsg re) {
        return new RespVo<T>(re.getCode(), re.getDesc());
    }

    public static <T> RespVo<T> error(RespStatusAndMsg re, String msg) {
        return new RespVo<T>(re.getCode(), msg);
    }

    public static <T> RespVo<T> error(RespStatusAndMsg re, BindingResult bindingResult) {
        return new RespVo<T>(re.getCode(), Objects.requireNonNull(bindingResult.getFieldError()).getDefaultMessage());
    }
}
