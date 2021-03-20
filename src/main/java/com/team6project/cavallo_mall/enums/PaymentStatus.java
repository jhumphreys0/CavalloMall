package com.team6project.cavallo_mall.enums;

import lombok.Getter;

/**
 * description:
 * author: Yuchen Bai
 * email: y.bai19@newcastle.ac.uk
 * date: 2021/3/8 0:17
 */
@Getter
public enum PaymentStatus {

    UNPAID(0, "Unpaid"),

    PAID(1, "Paid");

    Integer code;

    String desc;

    PaymentStatus(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
