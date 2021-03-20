package com.team6project.cavallo_mall.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * description:
 * author: Yuchen Bai
 * email: y.bai19@newcastle.ac.uk
 * date: 2021/3/1 4:16
 */
@ConfigurationProperties(prefix = "payment")
@Data
@Configuration
public class HorsePayConfig {

    private String horsePayUrl;
}
