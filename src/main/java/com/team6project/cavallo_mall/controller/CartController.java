package com.team6project.cavallo_mall.controller;

import com.team6project.cavallo_mall.constants.CavalloConstant;
import com.team6project.cavallo_mall.model.CartAddedReqModel;
import com.team6project.cavallo_mall.model.CartUpdateReqModel;
import com.team6project.cavallo_mall.pojo.User;
import com.team6project.cavallo_mall.service.impl.CartServiceImpl;
import com.team6project.cavallo_mall.vo.CartVo;
import com.team6project.cavallo_mall.vo.RespVo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

/**
 * description:
 * author: Yuchen Bai
 * email: y.bai19@newcastle.ac.uk
 * date: 2021/2/21 19:41
 */
@RestController
public class CartController {

    @Resource
    private CartServiceImpl cartService;


    @PostMapping("/carts/add")
    public RespVo<CartVo> addGoods(@Valid @RequestBody CartAddedReqModel cartAddedReqModel, HttpSession session) {
        User user = (User) session.getAttribute(CavalloConstant.CURRENT_USER);
        return cartService.addGoods(cartAddedReqModel, user.getId());
    }

    @GetMapping("/carts")
    public RespVo<CartVo> findAll(HttpSession session) {
        User user = (User) session.getAttribute(CavalloConstant.CURRENT_USER);
        return cartService.findAll(user.getId());
    }

    @PutMapping("/carts/{productId}")
    public RespVo<CartVo> updateCart(@PathVariable Integer productId, @Valid @RequestBody CartUpdateReqModel cartUpdateReqModel, HttpSession session) {
        User user = (User) session.getAttribute(CavalloConstant.CURRENT_USER);
        return cartService.updateCart(user.getId(), productId, cartUpdateReqModel);
    }

    @DeleteMapping("/carts/{productId}")
    public RespVo<CartVo> deleteCart(@PathVariable Integer productId, HttpSession session) {
        User user = (User) session.getAttribute(CavalloConstant.CURRENT_USER);
        return cartService.deleteCart(user.getId(), productId);
    }

    @PutMapping("/carts/selectAll")
    public RespVo<CartVo> selectAll(HttpSession session) {
        User user = (User) session.getAttribute(CavalloConstant.CURRENT_USER);
        return cartService.selectAll(user.getId());
    }

    @PutMapping("/carts/unSelectAll")
    public RespVo<CartVo> unSelectAll(HttpSession session) {
        User user = (User) session.getAttribute(CavalloConstant.CURRENT_USER);
        return cartService.unSelectedAll(user.getId());
    }

    @GetMapping("/carts/products/sumQuantity")
    public RespVo<Integer> sumQuantity(HttpSession session) {
        User user = (User) session.getAttribute(CavalloConstant.CURRENT_USER);
        return cartService.sumQuantity(user.getId());
    }


}
