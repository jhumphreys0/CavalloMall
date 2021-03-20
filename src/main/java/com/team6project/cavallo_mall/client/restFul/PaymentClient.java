package com.team6project.cavallo_mall.client.restFul;

import com.alibaba.fastjson.JSON;
import com.team6project.cavallo_mall.config.HorsePayConfig;
import com.team6project.cavallo_mall.model.HorsePayRespModel;
import com.team6project.cavallo_mall.vo.HorsePayVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;


/**
 * description:
 * author: Yuchen Bai
 * email: y.bai19@newcastle.ac.uk
 * date: 2021/3/1 3:13
 */
@Slf4j
@Component
public class PaymentClient {

    @Resource
    private RestTemplate restTemplate;

    @Resource
    private HorsePayConfig horsePayConfig;


    public HorsePayRespModel post(HorsePayVo horsePayVo) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON_UTF8);
        Map<String, Object> requestMap = new HashMap<>();
        requestMap.put("storeID", horsePayVo.getStoreID());
        requestMap.put("customerID", horsePayVo.getCustomerID());
        requestMap.put("date", horsePayVo.getDate());
        requestMap.put("time", horsePayVo.getTime());
        requestMap.put("timeZone", horsePayVo.getTimeZone());
        requestMap.put("transactionAmount", horsePayVo.getTransactionAmount());
        requestMap.put("currencyCode", horsePayVo.getCurrencyCode());
        requestMap.put("forcePaymentSatusReturnType", horsePayVo.getForcePaymentSatusReturnType());
        HttpEntity<String> requestEntity = new HttpEntity<>(JSON.toJSONString(requestMap), headers);
        return JSON.parseObject(restTemplate.postForObject(horsePayConfig.getHorsePayUrl(), requestEntity, String.class), HorsePayRespModel.class);
    }
}
