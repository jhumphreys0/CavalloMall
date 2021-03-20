package com.team6project.cavallo_mall.vo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * description:
 * author: Yuchen Bai
 * email: y.bai19@newcastle.ac.uk
 * date: 2021/3/7 23:38
 */
@Data
public class PaymentVo {

    private Integer id;

    private String orderNo;

    private Integer userId;

    private String username;

    private Integer paymentStatus;

    private Integer forceType;

    private BigDecimal paymentAmount;

    private Date createTime;

    private String currencyCode;

    private Date updateTime;
}
