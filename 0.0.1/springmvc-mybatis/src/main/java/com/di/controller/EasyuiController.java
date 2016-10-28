package com.di.controller;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.di.bo.UserBo;
import com.di.model.User;
import com.di.model.UserExample;
import com.di.service.UserService;
import com.di.toolkit.JacksonUtil;
import com.github.pagehelper.PageInfo;

/**
 * @author di:
 * @date 创建时间：2016年10月27日 下午11:13:00
 * @version
 */
@Controller
@RequestMapping(path = "/easyui")
public class EasyuiController {
	@Autowired
	private UserService userService;

	@ResponseBody
	@RequestMapping(path = "/getstyle.json")
	public Object getStyle(HttpSession session) {
		String style = (String) session.getAttribute("style");
		HashMap<String, Object> m = new HashMap<>();
		m.put("style", style == null ? "default" : style);
		return m;
	}

	@ResponseBody
	@RequestMapping(path = "/setstyle.json")
	public String setStyle(String style, HttpSession session) {
		session.setAttribute("style", style);
		HashMap<String, Object> m = new HashMap<>();
		m.put("success", true);
		return JacksonUtil.pojoToJson(m);
	}

	@ResponseBody
	@RequestMapping(path = "/jsonp.json")
	public String jsonp(String callback) {
		HashMap<String, Object> m = new HashMap<>();
		m.put("success", true);
		String res = callback + "(" + JacksonUtil.pojoToJson(m) + ")";
		return res;
	}

	@ResponseBody
	@RequestMapping(path = "/datagrid_data.json")
	public Object datagrid_data(UserBo bo) {
		HashMap<String, Object> m = new HashMap<>();
		PageInfo<User> pageInfo = userService.findPagerByBusinessObject(bo);
		m.put("rows", pageInfo.getList());
		m.put("total", pageInfo.getTotal());
		return m;
	}
}
