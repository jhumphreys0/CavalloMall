package com.team6project.cavallo_mall.service;

import com.github.pagehelper.PageInfo;
import com.team6project.cavallo_mall.model.DeliveryReqModel;
import com.team6project.cavallo_mall.vo.DeliveryVo;
import com.team6project.cavallo_mall.vo.RespVo;

/**
 * description:
 * author: Yuchen Bai
 * email: y.bai19@newcastle.ac.uk
 * date: 2021/2/23 1:41
 */
public interface DeliveryService {

    RespVo<DeliveryVo> addDeliveryInfo(Integer uid, DeliveryReqModel deliveryReqModel);

    RespVo deleteDeliveryInfo(Integer uid, Integer deliveryId);

    RespVo updateDeliveryInfo(Integer uid, Integer deliveryId, DeliveryReqModel deliveryReqModel);

    RespVo<PageInfo> findAllDeliveryInfo(Integer uid, Integer pageNum, Integer pageSize);

}
