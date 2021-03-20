package com.team6project.cavallo_mall.enums;

import lombok.Getter;

/**
 * description:
 * author: Yuchen Bai
 * email: y.bai19@newcastle.ac.uk
 * date: 2021/2/24 23:59
 */
@Getter
public enum OrderStatus {

    CANCELLED(0, "Cancelled"),

    UNPAID(1, "Unpaid"),

    PAID(2, "Paid"),

    DELIVERING(3, "Delivering"),

    ;

    Integer code;

    String desc;

    OrderStatus(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
