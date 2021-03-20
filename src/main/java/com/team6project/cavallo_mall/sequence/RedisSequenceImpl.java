package com.team6project.cavallo_mall.sequence;


import com.team6project.cavallo_mall.client.redis.RedisClient;
import com.team6project.cavallo_mall.util.Strings;

import javax.annotation.Resource;

/**
 * description:
 * author: Yuchen Bai
 * email: y.bai19@newcastle.ac.uk
 * date: 2021/2/23 16:17
 */
public class RedisSequenceImpl implements SequenceApi {
	
	private static final String prefix = "sequences";
	
	@Resource
	private RedisClient redisClient;


	public Long nextVal(String seq) {
		return redisClient.seqIncr(Strings.join(new String[]{prefix, seq}, ":"));
	}
}
