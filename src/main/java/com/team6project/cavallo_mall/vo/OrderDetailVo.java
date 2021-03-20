package com.team6project.cavallo_mall.vo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * description:
 * author: Yuchen Bai
 * email: y.bai19@newcastle.ac.uk
 * date: 2021/2/24 18:54
 */
@Data
public class OrderDetailVo {
    private String orderNo;

    private Integer productId;

    private String productName;

    private String productImage;

    private BigDecimal currentUnitPrice;

    private Integer quantity;

    private BigDecimal totalPrice;

    private Date createTime;

}
