package com.team6project.cavallo_mall.model;

import lombok.Data;

/**
 * description:
 * author: Yuchen Bai
 * email: y.bai19@newcastle.ac.uk
 * date: 2021/3/1 3:54
 */
@Data
public class HorsePayRespModel {

    private String storeID;

    private String customerID;

    private String date;

    private String time;

    private String timeZone;

    private Float transactionAmount;

    private String currencyCode;

    private HorsePayRespSuccessModel paymetSuccess;

}
