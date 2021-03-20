package com.team6project.cavallo_mall.vo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * description: cart
 * author: Yuchen Bai
 * email: y.bai19@newcastle.ac.uk
 * date: 2021/2/21 17:42
 */
@Data
public class CartVo {

    private List<CartProductVo> cartProductVoList;

    private Boolean selectedAll;

    private BigDecimal cartTotalPrice;

    private Integer cartTotalQuantity;
}
