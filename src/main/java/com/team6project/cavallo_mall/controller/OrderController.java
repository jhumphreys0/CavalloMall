package com.team6project.cavallo_mall.controller;

import com.github.pagehelper.PageInfo;
import com.team6project.cavallo_mall.model.OrderReqModel;
import com.team6project.cavallo_mall.pojo.User;
import com.team6project.cavallo_mall.service.impl.OrderServiceImpl;
import com.team6project.cavallo_mall.vo.OrderVo;
import com.team6project.cavallo_mall.vo.RespVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import static com.team6project.cavallo_mall.constants.CavalloConstant.CURRENT_USER;

/**
 * description:
 * author: Yuchen Bai
 * email: y.bai19@newcastle.ac.uk
 * date: 2021/2/26 0:54
 */
@RestController
@RequestMapping("/order")
@Slf4j
public class OrderController {

    @Resource
    private OrderServiceImpl orderService;


    @PostMapping("/createOrder")
    public RespVo<OrderVo> createOrder(@Valid @RequestBody OrderReqModel orderReqModel, HttpSession httpSession) {
        User user = (User) httpSession.getAttribute(CURRENT_USER);
        return orderService.createOrder(user.getId(), orderReqModel.getDeliveryId());
    }

    @GetMapping("/findOrder")
    public RespVo<PageInfo> findOrderByUid(HttpSession httpSession,
                                           @RequestParam (required = false, defaultValue = "1") Integer pageNum,
                                           @RequestParam (required = false, defaultValue = "20") Integer pageSize) {
        User user = (User) httpSession.getAttribute(CURRENT_USER);
        return orderService.findOrderByUid(user.getId(), pageNum, pageSize);
    }

    @GetMapping("/findOrderDetail/{orderNo}")
    public RespVo<OrderVo> findOrderDetail(HttpSession httpSession, @PathVariable String orderNo) {
        User user = (User) httpSession.getAttribute(CURRENT_USER);
        return orderService.findOrderDetail(user.getId(), orderNo);
    }

    @PutMapping("/cancelOrder/{orderNo}")
    public RespVo cancelOrder(HttpSession httpSession, @PathVariable String orderNo) {
        User user = (User) httpSession.getAttribute(CURRENT_USER);
        return orderService.cancelOrderByUidAndOrderNo(user.getId(), orderNo);
    }

    @GetMapping("/findOrderQuantityByDay")
    public RespVo findOrderQuantityByDay(HttpSession httpSession) {
        User user = (User) httpSession.getAttribute(CURRENT_USER);
        return orderService.findOrderQuantityByDay(user.getRole());
    }

    @GetMapping("/findOrderQuantityByWeek")
    public RespVo findOrderQuantityByWeek(HttpSession httpSession) {
        User user = (User) httpSession.getAttribute(CURRENT_USER);
        return orderService.findOrderQuantityByWeek(user.getRole());
    }

    @GetMapping("/findOrderQuantityByMonth")
    public RespVo findOrderQuantityByMonth(HttpSession httpSession) {
        User user = (User) httpSession.getAttribute(CURRENT_USER);
        return orderService.findOrderQuantityByMonth(user.getRole());
    }
}
