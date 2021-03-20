package com.team6project.cavallo_mall.vo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * description:
 * author: Yuchen Bai
 * email: y.bai19@newcastle.ac.uk
 * date: 2021/2/24 18:51
 */
@Data
public class OrderVo {
    private String orderNo;

    private BigDecimal paymentAmount;

    private Integer deliveryId;

    private Integer status;

    private Date paymentTime;

    private Date sendTime;

    private Date createTime;

    private DeliverySpecVo deliverySpecVo;

    private List<OrderDetailVo> orderDetailVoList;
}
