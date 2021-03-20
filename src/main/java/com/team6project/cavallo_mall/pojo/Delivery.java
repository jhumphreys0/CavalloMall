package com.team6project.cavallo_mall.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class Delivery {
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