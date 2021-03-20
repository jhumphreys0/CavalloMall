package com.team6project.cavallo_mall.service;

import com.team6project.cavallo_mall.vo.PaymentVo;
import com.team6project.cavallo_mall.vo.RespVo;

/**
 * description:
 * author: Yuchen Bai
 * email: y.bai19@newcastle.ac.uk
 * date: 2021/3/7 23:37
 */
public interface PaymentService {

    RespVo<PaymentVo> createPayment(Integer uid, String orderNo);
}
