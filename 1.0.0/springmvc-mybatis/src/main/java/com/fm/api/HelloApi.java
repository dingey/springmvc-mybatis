package com.fm.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloApi {
	@ResponseBody
	@RequestMapping(value = "/api/hi.do")
	public String hi() {
		return "你好！";
	}
}
