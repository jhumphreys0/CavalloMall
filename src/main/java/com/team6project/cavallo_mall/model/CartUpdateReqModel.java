package com.team6project.cavallo_mall.model;

import lombok.Data;

/**
 * description:
 * author: Yuchen Bai
 * email: y.bai19@newcastle.ac.uk
 * date: 2021/2/22 2:02
 */
@Data
public class CartUpdateReqModel {

    private Integer quantity;

    private Boolean selected;
}
