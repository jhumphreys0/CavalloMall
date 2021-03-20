package com.team6project.cavallo_mall.vo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * description:
 * author: Yuchen Bai
 * email: y.bai19@newcastle.ac.uk
 * date: 2021/2/19 23:46
 */
@Data
public class ProductDetailsVo {
    private Integer id;

    private Integer categoryId;

    private String name;

    private String subtitle;

    private Integer quantitySold;

    private String mainImage;

    private String specification;

    private String detail;

    private BigDecimal price;

    private Integer status;

    private Date createTime;

    private Date updateTime;
}
