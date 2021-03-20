package com.team6project.cavallo_mall.model;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * description:
 * author: Yuchen Bai
 * email: y.bai19@newcastle.ac.uk
 * date: 2021/2/26 0:59
 */
@Data
public class OrderReqModel {

    @NotNull(message = "deliveryId cannot be empty")
    private Integer deliveryId;

}
