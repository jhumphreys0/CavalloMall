package com.team6project.cavallo_mall.enums;

import lombok.Getter;

/**
 * description: Role 0-customer, 1-admin
 * author: Yuchen Bai
 * email: y.bai19@newcastle.ac.uk
 * date: 2021/2/16 23:42
 */
@Getter
public enum UserRole {

    CUSTOMER(0),

    ADMIN(1)

    ;

    Integer code;

    UserRole(Integer code) {
        this.code = code;
    }
}
