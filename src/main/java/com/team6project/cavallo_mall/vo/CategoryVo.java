package com.team6project.cavallo_mall.vo;

import lombok.Data;

import java.util.List;

/**
 * description:
 * author: Yuchen Bai
 * email: y.bai19@newcastle.ac.uk
 * date: 2021/2/18 16:04
 */
@Data
public class CategoryVo {

    private Integer id;

    private Integer parentId;

    private String name;

    private String status;

    private String sortedLevel;

    private List<CategoryVo> subCategories;
}
