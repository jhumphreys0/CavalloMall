package com.team6project.cavallo_mall.controller;

import com.team6project.cavallo_mall.model.UserLoginReqModel;
import com.team6project.cavallo_mall.model.UserRegisterReqModel;
import com.team6project.cavallo_mall.pojo.User;
import com.team6project.cavallo_mall.service.impl.UserServiceImpl;
import com.team6project.cavallo_mall.vo.RespVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.Objects;

import static com.team6project.cavallo_mall.constants.CavalloConstant.CURRENT_USER;
import static com.team6project.cavallo_mall.enums.RespStatusAndMsg.PARAMETER_ERROR;

/**
 * description:
 * author: Yuchen Bai
 * email: y.bai19@newcastle.ac.uk
 * date: 2021/2/17 0:14
 */
@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @Resource
    private UserServiceImpl userService;

    @PostMapping("/customer/register")
    public RespVo<User> register(@Valid @RequestBody UserRegisterReqModel userRegisterReqModel, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            log.error("The parameters submitted for registration are incorrect, {}",
                    Objects.requireNonNull(bindingResult.getFieldError()).getDefaultMessage());
            return RespVo.error(PARAMETER_ERROR, bindingResult);
        }
        User user = new User();
        com.team6project.cavallo_mall.util.Objects.fillTargetObject(userRegisterReqModel, user);
        return userService.register(user);
    }

    @PostMapping("/customer/login")
    public RespVo<User> login(@Valid @RequestBody UserLoginReqModel userLoginReqModel, BindingResult bindingResult, HttpSession session) {
        if (bindingResult.hasErrors()) return RespVo.error(PARAMETER_ERROR, bindingResult);
        RespVo<User> userRespVo = userService.login(userLoginReqModel.getUsername(), userLoginReqModel.getPassword());
        // set session
        session.setAttribute(CURRENT_USER, userRespVo.getData());
        return userRespVo;
    }

    @PostMapping("/admin/login")
    public RespVo<User> loginForAdmin(@Valid @RequestBody UserLoginReqModel userLoginReqModel, BindingResult bindingResult, HttpSession session) {
        if (bindingResult.hasErrors()) return RespVo.error(PARAMETER_ERROR, bindingResult);
        RespVo<User> userRespVo = userService.loginForAdmin(userLoginReqModel.getUsername(), userLoginReqModel.getPassword());
        session.setAttribute(CURRENT_USER, userRespVo.getData());
        return userRespVo;
    }

    @GetMapping("/userInfo")
    public RespVo<User> userInfo(HttpSession session) {
        User user = (User) session.getAttribute(CURRENT_USER);
        return RespVo.success(user);
    }

    @PostMapping("/logout")
    public RespVo<User> logout(HttpSession session) {
        // remove session
        session.removeAttribute(CURRENT_USER);
        return RespVo.success();
    }

}
