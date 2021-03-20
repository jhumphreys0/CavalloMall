package com.team6project.cavallo_mall.client.restFul;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.team6project.cavallo_mall.model.HorsePayRespModel;
import com.team6project.cavallo_mall.vo.HorsePayVo;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * description:
 * author: Yuchen Bai
 * email: y.bai19@newcastle.ac.uk
 * date: 2021/3/1 3:36
 */
@SpringBootTest
@Slf4j
public class PaymentClientTest {

    @Resource
    private PaymentClient paymentClient;

    private final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    @Test
    public void testPayment() {
        HorsePayVo horsePayVo = new HorsePayVo();
        horsePayVo.setStoreID("Team06");
        horsePayVo.setCustomerID("abc123");
        horsePayVo.setDate("01/12/2021");
        horsePayVo.setTime("12:00");
        horsePayVo.setTimeZone("GMT");
        horsePayVo.setTransactionAmount((float) 15.99);
        horsePayVo.setCurrencyCode("GBP");
        horsePayVo.setForcePaymentSatusReturnType(true);

        HorsePayRespModel horsePayRespModel = paymentClient.post(horsePayVo);
        log.info("result = {}", gson.toJson(horsePayRespModel));
    }
}
