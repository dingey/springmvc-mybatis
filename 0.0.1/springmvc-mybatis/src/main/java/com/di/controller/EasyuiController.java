package com.di.controller;

import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.di.toolkit.JacksonUtil;

/**
 * @author di:
 * @date 创建时间：2016年10月27日 下午11:13:00
 * @version
 */
@Controller
@RequestMapping(path = "/easyui")
public class EasyuiController {
	@ResponseBody
	@RequestMapping(path = "/getstyle.json")
	public String getStyle(HttpSession session) {
		String style = (String) session.getAttribute("style");
		HashMap<String, Object> m = new HashMap<>();
		m.put("style", style);
		return JacksonUtil.pojoToJson(m);
	}

	@ResponseBody
	@RequestMapping(path = "/setstyle.json")
	public String setStyle(String style, HttpSession session) {
		session.setAttribute("style", style);
		HashMap<String, Object> m = new HashMap<>();
		m.put("success", true);
		return JacksonUtil.pojoToJson(m);
	}
}
