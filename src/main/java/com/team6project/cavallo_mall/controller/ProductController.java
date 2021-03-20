package com.team6project.cavallo_mall.controller;

import com.github.pagehelper.PageInfo;
import com.team6project.cavallo_mall.pojo.User;
import com.team6project.cavallo_mall.service.impl.ProductServiceImpl;
import com.team6project.cavallo_mall.vo.ProductDetailsVo;
import com.team6project.cavallo_mall.vo.ProductSalesStatisticVo;
import com.team6project.cavallo_mall.vo.RespVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

import static com.team6project.cavallo_mall.constants.CavalloConstant.CURRENT_USER;

/**
 * description:
 * author: Yuchen Bai
 * email: y.bai19@newcastle.ac.uk
 * date: 2021/2/19 23:32
 */
@RestController
@Slf4j
@RequestMapping("/product")
public class ProductController {

    @Resource
    private ProductServiceImpl productService;

    @GetMapping("/findProductList")
    public RespVo<PageInfo> productList(@RequestParam(required = false) Integer categoryId,
                                        @RequestParam(required = false, defaultValue = "1") Integer pageNum,
                                        @RequestParam(required = false, defaultValue = "20") Integer pageSize) {
        return productService.productList(categoryId, pageNum, pageSize);
    }

    @GetMapping("/detail/{productId}")
    public RespVo<ProductDetailsVo> productDetail(@PathVariable Integer productId) {
        return productService.productDetail(productId);
    }

    @GetMapping("/findSalesQuantity/{categoryId}")
    public RespVo<ProductSalesStatisticVo> findProductSalesQuantity(@PathVariable Integer categoryId, HttpSession session) {
        User user = (User) session.getAttribute(CURRENT_USER);
        return productService.findProductSalesQuantity(categoryId, user.getRole());
    }

    @GetMapping("/findSalesQuantityList")
    public RespVo<List<ProductSalesStatisticVo>> findProductSalesQuantity(HttpSession session) {
        User user = (User) session.getAttribute(CURRENT_USER);
        return productService.findProductSalesQuantityList(user.getRole());
    }
}
