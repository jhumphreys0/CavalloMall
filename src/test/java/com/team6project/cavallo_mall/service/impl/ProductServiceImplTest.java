package com.team6project.cavallo_mall.service.impl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.team6project.cavallo_mall.service.ProductService;
import com.team6project.cavallo_mall.vo.ProductSalesStatisticVo;
import com.team6project.cavallo_mall.vo.RespVo;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * description:
 * author: Yuchen Bai
 * email: y.bai19@newcastle.ac.uk
 * date: 2021/2/19 21:43
 */
@SpringBootTest
@Transactional
@Slf4j
class ProductServiceImplTest {

    private final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    @Resource
    private ProductService productService;

    @Test
    void productList() {
        productService.productList(null, 1, 4);

    }

    @Test
    void productDetail() {
        productService.productDetail(26);
    }

    @Test
    void findProductSalesQuantity() {
        RespVo<ProductSalesStatisticVo> productSalesQuantity = productService.findProductSalesQuantity(100033, 1);
        log.info("result = {}", gson.toJson(productSalesQuantity));
    }

    @Test
    void findProductSalesQuantityList() {
        RespVo<List<ProductSalesStatisticVo>> productSalesQuantityList = productService.findProductSalesQuantityList(1);
        log.info("result = {}", gson.toJson(productSalesQuantityList));
    }




}