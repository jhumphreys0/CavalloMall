package com.team6project.cavallo_mall.service.impl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.team6project.cavallo_mall.model.CartAddedReqModel;
import com.team6project.cavallo_mall.model.CartUpdateReqModel;
import com.team6project.cavallo_mall.service.CartService;
import com.team6project.cavallo_mall.vo.CartVo;
import com.team6project.cavallo_mall.vo.RespVo;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * description:
 * author: Yuchen Bai
 * email: y.bai19@newcastle.ac.uk
 * date: 2021/2/21 21:45
 */
@SpringBootTest
@Transactional
@Slf4j
class ShoppingCartServiceImplTest {

    @Resource
    private CartService cartService;

    @Resource
    private GsonBuilder gsonBuilder;

    private static final Integer productId = 30;

    private static final Integer uid = 4;

    @BeforeEach
    void addGoods() {
        CartAddedReqModel cartAddedReqModel = new CartAddedReqModel();
        cartAddedReqModel.setProductId(productId);
        cartAddedReqModel.setSelected(true);

        RespVo<CartVo> cartVoRespVo = cartService.addGoods(cartAddedReqModel, uid);
        /*
        Format json message
         */
        Gson gson = gsonBuilder.setPrettyPrinting().create();
        log.info("result = {}", gson.toJson(cartVoRespVo));
    }

    @Test
    void findAll() {
        RespVo<CartVo> cartResult = cartService.findAll(4);
        Gson gson = gsonBuilder.setPrettyPrinting().create();
        log.info("result = {}", gson.toJson(cartResult));
    }

    @Test
    void updateCart() {
        CartUpdateReqModel form = new CartUpdateReqModel();
        form.setQuantity(10);
        form.setSelected(true);
        RespVo<CartVo> cartVoRespVo = cartService.updateCart(4, 30, form);
        Gson gson = gsonBuilder.setPrettyPrinting().create();
        log.info("result = {}", gson.toJson(cartVoRespVo));
    }

    @Test
    void deleteCart() {
        RespVo<CartVo> cartVoRespVo = cartService.deleteCart(4, 31);
        Gson gson = gsonBuilder.setPrettyPrinting().create();
        log.info("result = {}", gson.toJson(cartVoRespVo));

    }

    @Test
    void selectAll() {
        RespVo<CartVo> cartVoRespVo = cartService.selectAll(4);
        Gson gson = gsonBuilder.setPrettyPrinting().create();
        log.info("result = {}", gson.toJson(cartVoRespVo));
    }

    @Test
    void unSelectAll() {
        RespVo<CartVo> cartVoRespVo = cartService.unSelectedAll(4);
        Gson gson = gsonBuilder.setPrettyPrinting().create();
        log.info("result = {}", gson.toJson(cartVoRespVo));
    }

    @Test
    void sumQuantity() {
        RespVo<Integer> integerRespVo = cartService.sumQuantity(4);
        Gson gson = gsonBuilder.setPrettyPrinting().create();
        log.info("result = {}", gson.toJson(integerRespVo));
    }
}