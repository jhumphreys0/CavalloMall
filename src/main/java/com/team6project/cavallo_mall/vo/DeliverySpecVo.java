package com.team6project.cavallo_mall.vo;

import lombok.Data;

import java.util.Date;

/**
 * description:
 * author: Yuchen Bai
 * email: y.bai19@newcastle.ac.uk
 * date: 2021/3/10 2:16
 */
@Data
public class DeliverySpecVo {

    private Integer id;

    private Integer userId;

    private String firstname;

    private String lastname;

    private String phoneNo;

    private String city;

    private String address;

    private String postcode;

    private Date createTime;

    private Date updateTime;
}
