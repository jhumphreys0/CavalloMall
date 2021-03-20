package com.team6project.cavallo_mall.service;

import com.github.pagehelper.PageInfo;
import com.team6project.cavallo_mall.vo.*;

import java.util.List;

/**
 * description:
 * author: Yuchen Bai
 * email: y.bai19@newcastle.ac.uk
 * date: 2021/2/24 19:14
 */
public interface OrderService {

    RespVo cancelOrderByUidAndOrderNo(Integer uid, String orderNo);

    RespVo<OrderVo> createOrder(Integer uid, Integer shippingId);

    RespVo<PageInfo> findOrderByUid(Integer uid, Integer pageNum, Integer pageSize);

    RespVo<OrderVo> findOrderDetail(Integer uid, String orderNo);

    RespVo<List<OrderQuantityOfDayVo>> findOrderQuantityByDay(Integer roleId);

    RespVo<List<OrderQuantityOfWeekVo>> findOrderQuantityByWeek(Integer roleId);

    RespVo<List<OrderQuantityOfMonthVo>> findOrderQuantityByMonth(Integer roleId);
}
