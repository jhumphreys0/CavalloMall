package com.team6project.cavallo_mall.model;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * description:
 * author: Yuchen Bai
 * email: y.bai19@newcastle.ac.uk
 * date: 2021/3/10 2:24
 */
@Data
public class DeliveryReqModel {

    @NotBlank(message = "firstName can not be empty")
    private String firstname;
    @NotBlank(message = "lastName can not be empty")
    private String lastname;
    @NotBlank(message = "phoneNo can not be empty")
    private String phoneNo;
    @NotBlank(message = "city can not be empty")
    private String city;
    @NotBlank(message = "address can not be empty")
    private String address;
    @NotBlank(message = "postcode can not be empty")
    private String postcode;
}
