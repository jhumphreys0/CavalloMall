package com.team6project.cavallo_mall.service;

import com.team6project.cavallo_mall.vo.CategoryVo;
import com.team6project.cavallo_mall.vo.RespVo;

import java.util.List;
import java.util.Set;

/**
 * description:
 * author: Yuchen Bai
 * email: y.bai19@newcastle.ac.uk
 * date: 2021/2/18 16:08
 */
public interface CategoryService {

    /**
     *
     * @return
     */
    RespVo<List<CategoryVo>> findAllCategory();

    /**
     *
     * @param id
     * @param resultSet
     */
    void findSubCategoryId(Integer id, Set<Integer> resultSet);
}
