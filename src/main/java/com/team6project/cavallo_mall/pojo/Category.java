package com.team6project.cavallo_mall.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class Category {
    private Integer id;

    private Integer parentId;

    private String name;

    private String status;

    private String sortedLevel;

    private Date createTime;

    private Date updateTime;

}