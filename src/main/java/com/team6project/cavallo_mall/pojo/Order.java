package com.team6project.cavallo_mall.pojo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class Order {
    private Integer id;

    private String orderNo;

    private Integer userId;

    private Integer deliveryId;

    private BigDecimal paymentAmount;

    private Integer status;

    private Date paymentTime;

    private Date sendTime;

    private Date createTime;

    private Date updateTime;


}