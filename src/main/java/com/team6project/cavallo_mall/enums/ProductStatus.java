package com.team6project.cavallo_mall.enums;

import lombok.Getter;

/**
 * description:
 * author: Yuchen Bai
 * email: y.bai19@newcastle.ac.uk
 * date: 2021/2/20 0:15
 */
@Getter
public enum ProductStatus {

    IN_STOCK(1),

    OUT_OF_STOCK(2),

    DELETED(3),

    ;

    Integer code;

    ProductStatus(Integer code) {
        this.code = code;
    }
}
