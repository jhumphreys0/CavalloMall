package com.team6project.cavallo_mall.enums;

import lombok.Getter;

/**
 * description:
 * author: Yuchen Bai
 * email: y.bai19@newcastle.ac.uk
 * date: 2021/2/17 0:51
 */
@Getter
public enum RespStatusAndMsg {

    SUCCESS(0, "Success."),
    SERVER_ERROR(99999, "Server error."),
    PASSWORD_ERROR(10001, "Wrong password."),
    USERNAME_EXIST(10002, "Username already exists."),
    PARAMETER_ERROR(10003, "Parameter error"),
    EMAIL_EXIST(10004, "Email already exists."),
    NOT_LOGIN(10010, "User is not logged in."),
    USERNAME_OR_PASSWORD_ERROR(10011, "Wrong username or password."),
    PRODUCT_OUT_OF_STOCK_OR_DELETED(20012, "This product out of stock or deleted"),
    GOODS_NOT_EXIST(20013, "The goods is not exist"),
    GOODS_STOCK_ERROR(20014,"Goods stock error."),
    CART_GOODS_NOT_EXIST(20015, "The goods does not exist in the cart"),
    DELIVERY_INFO_DELETE_FAIL(30016, "Failed to delete delivery address."),
    DELIVERY_ADDRESS_NOT_EXIST(30017, "Delivery address not exist"),
    CART_PRODUCT_IS_UNSELECTED(30018, "Product in the cart is not selected"),
    ORDER_NOT_EXIST(40019, "The order is not exist"),
    ORDER_STATUS_INCORRECT(40020, "The order status is incorrect"),
    USER_NOT_EXIST(10021, "This user is not exist"),
    USER_ROLE_ERROR(10022, "This user role is incorrect")
    ;

    Integer code;

    String desc;

    RespStatusAndMsg(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
