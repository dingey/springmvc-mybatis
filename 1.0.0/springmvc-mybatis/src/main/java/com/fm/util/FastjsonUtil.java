package com.fm.util;

import com.alibaba.fastjson.JSON;

public class FastjsonUtil {
	public static String toJSONString(Object o) {
		return JSON.toJSONString(o);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static Object parseObject(String jsonString, Class c) {
		return JSON.parseObject(jsonString, c);
	}
}
