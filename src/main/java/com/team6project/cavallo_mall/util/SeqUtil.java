package com.team6project.cavallo_mall.util;

import com.team6project.cavallo_mall.sequence.SequenceApi;

import javax.annotation.Resource;

/**
 * description:
 * author: Yuchen Bai
 * email: y.bai19@newcastle.ac.uk
 * date: 2021/2/23 15:20
 */
public class SeqUtil {

	@Resource
	private SequenceApi sequenceApi;
	
	public String nextNum(String noType, int limit) {
		Long val = sequenceApi.nextVal(noType);
		if (val != null) {
			return Strings.lpad(String.valueOf(val), limit, "0");
		}
		return "";
	}
}
