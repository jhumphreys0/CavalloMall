package com.team6project.cavallo_mall.client.redis;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.StringRedisTemplate;

import javax.annotation.Resource;

/**
 * description:
 * author: Yuchen Bai
 * email: y.bai19@newcastle.ac.uk
 * date: 2021/2/23 16:33
 */
@Configuration
public class RedisClientImpl implements RedisClient {

	@Resource
    protected StringRedisTemplate stringRedisTemplate;
	
	private RedisClientImpl(){}
	
	public RedisClientImpl(StringRedisTemplate stringRedisTemplate){
		this.stringRedisTemplate = stringRedisTemplate;
	}

	@Override
	public Long seqIncr (String key) {
		return stringRedisTemplate.opsForValue().increment(key, 1);
	}

}
