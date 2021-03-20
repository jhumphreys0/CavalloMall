package com.team6project.cavallo_mall.service;

import com.team6project.cavallo_mall.model.CartAddedReqModel;
import com.team6project.cavallo_mall.model.CartUpdateReqModel;
import com.team6project.cavallo_mall.vo.CartVo;
import com.team6project.cavallo_mall.vo.RespVo;

/**
 * description:
 * author: Yuchen Bai
 * email: y.bai19@newcastle.ac.uk
 * date: 2021/2/21 20:21
 */
public interface CartService {

    RespVo<CartVo> addGoods(CartAddedReqModel form, Integer uid);

    RespVo<CartVo> findAll(Integer uid);

    RespVo<CartVo> updateCart(Integer uid, Integer productId, CartUpdateReqModel form);

    RespVo<CartVo> deleteCart(Integer uid, Integer productId);

    RespVo<CartVo> selectAll(Integer uid);

    RespVo<CartVo> unSelectedAll(Integer uid);

    RespVo<Integer> sumQuantity(Integer uid);
}
