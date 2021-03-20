package com.team6project.cavallo_mall.pojo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class Payment {
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