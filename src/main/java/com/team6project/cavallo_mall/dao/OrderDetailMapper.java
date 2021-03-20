package com.team6project.cavallo_mall.dao;

import com.team6project.cavallo_mall.pojo.OrderDetail;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Set;

public interface OrderDetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderDetail record);

    int insertSelective(OrderDetail record);

    OrderDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrderDetail record);

    int updateByPrimaryKey(OrderDetail record);

    int batchInsert(@Param("orderDetailList") List<OrderDetail> orderDetailList);

    List<OrderDetail> selectByOrderNoSet(@Param("orderNoSet") Set<String> orderNoSet);

    List<OrderDetail> selectByOrderNo(String orderNo);
}