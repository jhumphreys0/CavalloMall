package com.team6project.cavallo_mall.controller;

import com.github.pagehelper.PageInfo;
import com.team6project.cavallo_mall.constants.CavalloConstant;
import com.team6project.cavallo_mall.model.DeliveryReqModel;
import com.team6project.cavallo_mall.pojo.User;
import com.team6project.cavallo_mall.service.impl.DeliveryServiceImpl;
import com.team6project.cavallo_mall.vo.DeliveryVo;
import com.team6project.cavallo_mall.vo.RespVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

/**
 * description:
 * author: Yuchen Bai
 * email: y.bai19@newcastle.ac.uk
 * date: 2021/2/23 18:56
 */
@RestController
@Slf4j
@RequestMapping("/delivery")
public class DeliveryController {

    @Resource
    private DeliveryServiceImpl deliveryService;

    @PostMapping("/addDeliveryInfo")
    public RespVo<DeliveryVo> addDeliveryInfo(@Valid @RequestBody DeliveryReqModel deliveryReqModel, HttpSession httpSession) {
        User user = (User) httpSession.getAttribute(CavalloConstant.CURRENT_USER);
        return deliveryService.addDeliveryInfo(user.getId(), deliveryReqModel);
    }

    @DeleteMapping("/deleteDeliveryInfo/{deliverId}")
    public RespVo deleteDeliveryInfo(@PathVariable Integer deliverId, HttpSession httpSession) {
        User user = (User) httpSession.getAttribute(CavalloConstant.CURRENT_USER);
        return deliveryService.deleteDeliveryInfo(user.getId(), deliverId);
    }

    @PutMapping("/updateDeliveryInfo/{deliverId}")
    public RespVo updateShippingInfo(@PathVariable Integer deliverId, @Valid @RequestBody DeliveryReqModel deliveryReqModel, HttpSession httpSession) {
        User user = (User) httpSession.getAttribute(CavalloConstant.CURRENT_USER);
        return deliveryService.updateDeliveryInfo(user.getId(), deliverId, deliveryReqModel);
    }

    @GetMapping("/findAllDeliveryInfo")
    public RespVo<PageInfo> findAllDeliveryInfo(HttpSession httpSession,
                                                @RequestParam(required = false, defaultValue = "1") Integer pageNum,
                                                @RequestParam(required = false, defaultValue = "20") Integer pageSize) {
        User user = (User) httpSession.getAttribute(CavalloConstant.CURRENT_USER);
        return deliveryService.findAllDeliveryInfo(user.getId(), pageNum, pageSize);
    }
}
