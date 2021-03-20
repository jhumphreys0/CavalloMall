package com.team6project.cavallo_mall.controller;

import com.team6project.cavallo_mall.constants.CavalloConstant;
import com.team6project.cavallo_mall.pojo.User;
import com.team6project.cavallo_mall.service.impl.PaymentServiceImpl;
import com.team6project.cavallo_mall.vo.PaymentVo;
import com.team6project.cavallo_mall.vo.RespVo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * description:
 * author: Yuchen Bai
 * email: y.bai19@newcastle.ac.uk
 * date: 2021/3/8 9:14
 */
@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Resource
    private PaymentServiceImpl paymentService;


    @PutMapping("/paymentInfo/{orderNo}")
    public RespVo<PaymentVo> createPayment(@PathVariable String orderNo, HttpSession httpSession) {
        User user = (User) httpSession.getAttribute(CavalloConstant.CURRENT_USER);
        return paymentService.createPayment(user.getId(), orderNo);
    }
}
