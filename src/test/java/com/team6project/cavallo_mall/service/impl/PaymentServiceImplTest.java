package com.team6project.cavallo_mall.service.impl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.team6project.cavallo_mall.vo.PaymentVo;
import com.team6project.cavallo_mall.vo.RespVo;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * description:
 * author: Yuchen Bai
 * email: y.bai19@newcastle.ac.uk
 * date: 2021/3/8 1:39
 */
@SpringBootTest
@Slf4j
class PaymentServiceImplTest {

    @Resource
    private PaymentServiceImpl paymentService;

    private final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    @Test
    void createPayment() {
        RespVo<PaymentVo> payment = paymentService.createPayment(11, "00000003");
        log.info("result = {}", gson.toJson(payment));
    }
}