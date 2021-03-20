package com.team6project.cavallo_mall.dao;

import com.team6project.cavallo_mall.pojo.Delivery;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Set;

public interface DeliveryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Delivery record);

    int insertSelective(Delivery record);

    Delivery selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Delivery record);

    int updateByPrimaryKey(Delivery record);

    int deleteByIdAndUid(@Param("uid") Integer uid, @Param("deliveryId") Integer deliveryId);

    List<Delivery> selectByUid(Integer uid);

    Delivery selectByUidAndDeliveryId(@Param("uid") Integer uid, @Param("deliveryId") Integer deliveryId);

    List<Delivery> selectByIdSet(@Param("idSet") Set<Integer> idSet);
}