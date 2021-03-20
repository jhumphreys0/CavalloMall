package com.team6project.cavallo_mall.model;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * description:
 * author: Yuchen Bai
 * email: y.bai19@newcastle.ac.uk
 * date: 2021/2/21 19:35
 */
@Data
public class CartAddedReqModel {

    @NotNull(message = "productId can not be empty")
    private Integer productId;

    private Boolean selected = true;

}
