package com.fm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AceController {

	@RequestMapping(value = "/ace.do")
	public ModelAndView dist(String page) {
		ModelAndView view = new ModelAndView("admin/" + page);
		return view;
	}

	@RequestMapping(value = "/pages")
	public ModelAndView dispatch(@PathVariable()String page) {
		ModelAndView view = new ModelAndView("admin/" + page);
		return view;
	}
}
