package com.team6project.cavallo_mall.service.impl;

import com.github.pagehelper.PageInfo;
import com.team6project.cavallo_mall.enums.RespStatusAndMsg;
import com.team6project.cavallo_mall.model.DeliveryReqModel;
import com.team6project.cavallo_mall.vo.DeliveryVo;
import com.team6project.cavallo_mall.vo.RespVo;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * description:
 * author: Yuchen Bai
 * email: y.bai19@newcastle.ac.uk
 * date: 2021/2/23 2:35
 */
@SpringBootTest
@Slf4j
class DeliveryServiceImplTest {

    @Resource
    private DeliveryServiceImpl deliveryService;


    @Test
    void addDeliveryInfo() {
        DeliveryReqModel deliveryReqModel = new DeliveryReqModel();
        deliveryReqModel.setFirstname("Yuchen");
        deliveryReqModel.setLastname("Bai");
        deliveryReqModel.setCity("Newcastle");
        deliveryReqModel.setPhoneNo("1234567890000");
        deliveryReqModel.setPostcode("AAA BBB");
        deliveryReqModel.setAddress("test address123");
        RespVo<DeliveryVo> deliveryVoRespVo = deliveryService.addDeliveryInfo(10, deliveryReqModel);
        log.info("result = {}", deliveryVoRespVo);
        Assertions.assertEquals(RespStatusAndMsg.SUCCESS.getCode(), deliveryVoRespVo.getStatus());
    }

    @Test
    void deleteDeliveryInfo() {
        RespVo respVo = deliveryService.deleteDeliveryInfo(10, 7);
        Assertions.assertEquals(RespStatusAndMsg.SUCCESS.getCode(), respVo.getStatus());
    }

    @Test
    void updateDeliveryInfo() {
        DeliveryReqModel deliveryReqModel = new DeliveryReqModel();
        deliveryReqModel.setCity("Beijing");
        RespVo respVo = deliveryService.updateDeliveryInfo(1, 1, deliveryReqModel);
        Assertions.assertEquals(RespStatusAndMsg.SUCCESS.getCode(), respVo.getStatus());
    }

    @Test
    void findAllDeliveryInfo() {
        RespVo<PageInfo> allDeliveryInfo = deliveryService.findAllDeliveryInfo(1, 1, 2);
        Assertions.assertEquals(RespStatusAndMsg.SUCCESS.getCode(), allDeliveryInfo.getStatus());
    }
}