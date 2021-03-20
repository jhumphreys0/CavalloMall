package com.team6project.cavallo_mall.pojo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
@Data
public class Product {
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