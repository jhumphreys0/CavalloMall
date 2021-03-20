package com.team6project.cavallo_mall.service.impl;

import com.github.pagehelper.PageInfo;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.team6project.cavallo_mall.service.OrderService;
import com.team6project.cavallo_mall.vo.*;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

/**
 * description:
 * author: Yuchen Bai
 * email: y.bai19@newcastle.ac.uk
 * date: 2021/2/24 22:45
 */
@SpringBootTest
@Slf4j
class OrderServiceImplTest {

    @Resource
    private OrderService orderService;

    private final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    @Test
    void createOrder() {
        RespVo<OrderVo> orderVoRespVo = orderService.createOrder(10, 6);
        log.info("result = {}", gson.toJson(orderVoRespVo));
        //Assertions.assertEquals(ResponseEnum.SUCCESS.getCode(), orderVoResponseVo.getStatus());
    }

    @Test
    void findOrderByUid() {
        RespVo<PageInfo> resultVo = orderService.findOrderByUid(10, 1, 4);
        log.info("result = {}", gson.toJson(resultVo));
    }

    @Test
    void findOrderDetail() {
        RespVo<OrderVo> orderDetail = orderService.findOrderDetail(10, "00000001");
        log.info("result = {}", gson.toJson(orderDetail));
    }

    @Test
    void cancelOrderByUidAndOrderNo() {
        RespVo respVo = orderService.cancelOrderByUidAndOrderNo(10, "00000003");
        log.info("result = {}", gson.toJson(respVo));
    }

    @Test
    void findOrderQuantityByDay() {
        RespVo<List<OrderQuantityOfDayVo>> orderQuantityByDay = orderService.findOrderQuantityByDay(1);
        log.info("result = {}", gson.toJson(orderQuantityByDay));
    }

    @Test
    void findOrderQuantityByWeek() {
        RespVo<List<OrderQuantityOfWeekVo>> orderQuantityByWeek = orderService.findOrderQuantityByWeek(1);
        log.info("result = {}", gson.toJson(orderQuantityByWeek));
    }

    @Test
    void findOrderQuantityByMonth() {
        RespVo<List<OrderQuantityOfMonthVo>> orderQuantityByMonth = orderService.findOrderQuantityByMonth(1);
        log.info("result = {}", gson.toJson(orderQuantityByMonth));
    }
}