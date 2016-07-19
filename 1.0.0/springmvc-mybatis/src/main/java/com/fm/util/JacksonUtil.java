package com.fm.util;

import java.io.IOException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

/**
 * @author di
 *
 */
public class JacksonUtil {
	static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
	static final XmlMapper XML_MAPPER = new XmlMapper();

	/*
	 * JAVA对象转JSON[JSON序列化]
	 */
	public static String pojoToJson(Object o) {
		String json = null;
		try {
			return OBJECT_MAPPER.writeValueAsString(o);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return json;
	}

	/*
	 * JSON转Java类[JSON反序列化]
	 */
	public static Object jsonToPojo(String json, Class<?> c) {
		Object o = null;
		try {
			o = OBJECT_MAPPER.readValue(json, c);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return o;
	}

	public static Object xmlToPojo(String xml, Class<?> c) {
		Object o = null;
		try {
			o = XML_MAPPER.readValue(xml, c);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return o;
	}

	public static String pojoToXml(Object o) {
		String s = null;
		try {
			s = XML_MAPPER.writeValueAsString(o);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return s;
	}

}
