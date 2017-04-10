package com.di.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.di.model.User;
import com.di.service.UserService;
import com.github.pagehelper.PageInfo;

/**
 * @author di
 */
@Controller
public class DemoController {
	@Autowired
	private UserService userService;

	@RequestMapping(path = "/demo")
	public String demo() {
		return "layout/demo";
	}

	@RequestMapping(path = "/page")
	public String page(@RequestParam(defaultValue = "1") int pageNum, @RequestParam(defaultValue = "10") int pageSize,
			Model model) {
		PageInfo<User> pageInfo = userService.findPage(new User(), pageNum, pageSize);
		model.addAttribute("pageInfo", pageInfo);
		return "layout/page";
	}
}
