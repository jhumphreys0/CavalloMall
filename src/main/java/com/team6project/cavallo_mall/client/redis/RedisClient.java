package com.team6project.cavallo_mall.client.redis;

/**
 * description:
 * author: Yuchen Bai
 * email: y.bai19@newcastle.ac.uk
 * date: 2021/2/23 16:30
 */
public interface RedisClient {

	Long seqIncr (String key);

}
