package com.team6project.cavallo_mall.pojo;

import lombok.Data;

/**
 * description:
 * author: Yuchen Bai
 * email: y.bai19@newcastle.ac.uk
 * date: 2021/2/21 21:32
 */
@Data
public class ShoppingCart {

    private Integer productId;

    private Integer quantity;

    private Boolean productSelected;

    public ShoppingCart() {
    }

    public ShoppingCart(Integer productId, Integer quantity, Boolean productSelected) {
        this.productId = productId;
        this.quantity = quantity;
        this.productSelected = productSelected;
    }
}
