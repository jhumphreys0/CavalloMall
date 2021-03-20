package com.team6project.cavallo_mall.util;

import lombok.extern.slf4j.Slf4j;

/**
 * description:
 * author: Yuchen Bai
 * email: y.bai19@newcastle.ac.uk
 * date: 2021/2/20 11:14
 */
@Slf4j
public class Strings {

	private Strings(){
    	
    }

	public static String nvl(String...args) {
		if (args == null ) return "";
		for (String arg : args) {
			if (arg != null && !"".equals(arg.trim())) {
				return arg.trim();
			}
		}
		return "";
	}

	public static String lpad(String str, int len, String pad) {
		if (str != null) {
			int len1 = len - str.length();
			StringBuffer sb = new StringBuffer();
			if (len1 > 0) {
				for (int i = 0; i < len1; i ++) {
					sb.append(pad);
				}
			}
			return sb.append(str).toString();
		}
		return null;
	}

	public static boolean isEmpty(String s) {
		return s == null || s.trim().equals("");
	}

	public static String join(String[] keys, String splitment){
		if (isEmpty(splitment)) {
			splitment = "";
		}
		if (keys == null) {
			return "";
		}
		StringBuffer ret = new StringBuffer("");
		for (int i = 0; i < keys.length; i ++) {
			if (i > 0) {
				ret.append(splitment);
			}
			ret.append(keys[i]);
		}
		return ret.toString();
	}

}
