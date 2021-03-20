package com.team6project.cavallo_mall.dao;

import com.team6project.cavallo_mall.pojo.Order;
import com.team6project.cavallo_mall.vo.OrderQuantityOfDayVo;
import com.team6project.cavallo_mall.vo.OrderQuantityOfMonthVo;
import com.team6project.cavallo_mall.vo.OrderQuantityOfWeekVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);

    List<Order> selectOrderByUid(Integer uid);

    Order selectByOrderNo(String orderNo);

    Order selectByOrderNoAndUid(@Param("uid") Integer uid, @Param("orderNo") String orderNo);

    List<OrderQuantityOfDayVo> countOrderByDay();

    List<OrderQuantityOfWeekVo> countOrderByWeek();

    List<OrderQuantityOfMonthVo> countOrderByMonth();
}