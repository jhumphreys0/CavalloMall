package com.team6project.cavallo_mall.service.impl;

import com.team6project.cavallo_mall.service.CategoryService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashSet;
import java.util.Set;

/**
 * description:
 * author: Yuchen Bai
 * email: y.bai19@newcastle.ac.uk
 * date: 2021/2/18 23:51
 */
@SpringBootTest
@Transactional
@Slf4j
class CategoryServiceImplTest {

    @Resource
    private CategoryService categoryService;

    @Test
    void selectAll() {
    }

    @Test
    void findSubCategoryId() {
        Set<Integer> set = new HashSet<>();
        categoryService.findSubCategoryId(100001, set);
        log.info("set = {}", set);
    }
}