package com.team6project.cavallo_mall.service.impl;

import com.team6project.cavallo_mall.enums.RespStatusAndMsg;
import com.team6project.cavallo_mall.enums.UserRole;
import com.team6project.cavallo_mall.pojo.User;
import com.team6project.cavallo_mall.service.UserService;
import com.team6project.cavallo_mall.vo.RespVo;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * description:
 * author: Yuchen Bai
 * email: y.bai19@newcastle.ac.uk
 * date: 2021/2/16 23:35
 */
@SpringBootTest
@Transactional
@Slf4j
class UserServiceImplTest {

    private static final String USERNAME = "jack";

    private static final String PASSWORD = "123456";

    @Resource
    private UserService userService;

    @Test
    void register() {
        User user = new User("jack", "123456", "jack@gmail.com", UserRole.CUSTOMER.getCode());
        RespVo<User> register = userService.register(user);
        Assertions.assertEquals(RespStatusAndMsg.SUCCESS.getCode(), register.getStatus());
    }

}