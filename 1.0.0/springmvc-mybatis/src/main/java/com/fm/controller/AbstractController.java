package com.fm.controller;

import java.util.Date;
import java.util.List;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.fm.controller.initbinder.DateBinder;
import com.fm.service.AbstractService;
import com.github.pagehelper.PageInfo;

/**
 * @author di
 *
 * @param <T>
 */
public abstract class AbstractController<T> {
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(Date.class, new DateBinder());
	}

	@RequestMapping(value = "/list.do")
	public ModelAndView list(@RequestParam(required = false, defaultValue = "1") int pageNum,
			@RequestParam(required = false, defaultValue = "10") int pageSize) {
		ModelAndView view = new ModelAndView(getPrefix() + "/list");
		List<T> list = getAbstractService().selectAll(pageNum, pageSize);
		view.addObject("pageInfo", new PageInfo<T>(list));
		view.addObject("list", list);
		view.addObject("pageNum", pageNum);
		view.addObject("pageSize", pageSize);
		return view;
	}

	@RequestMapping(value = "/show.do")
	public ModelAndView show(Integer id) {
		ModelAndView view = new ModelAndView(getNamespace() + "/edit");
		view.addObject("t", getAbstractService().select(id));
		return view;
	}

	@RequestMapping(value = "/add.do")
	public ModelAndView add() {
		ModelAndView view = new ModelAndView(getNamespace() + "/edit");
		return view;
	}

	@RequestMapping(value = "/edit.do")
	public ModelAndView edit(T t) {
		ModelAndView view = new ModelAndView("redirect:/" + getPrefix() + "/list.do");
		int i = getAbstractService().update(t);
		if (i == 0)
			i = getAbstractService().insert(t);
		return view;
	}

	@RequestMapping(value = "/del.do")
	public String del(Integer id) {
		getAbstractService().delete(id);
		return "redirect:/" + getPrefix() + "/list.do";
	}

	public abstract AbstractService<T> getAbstractService();

	public abstract String getNamespace();

	private String getPrefix() {
		return getNamespace() == null ? "" : getNamespace();
	}

}
