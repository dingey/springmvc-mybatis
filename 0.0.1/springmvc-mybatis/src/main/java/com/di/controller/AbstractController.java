package com.di.controller;

import java.util.Date;
import java.util.HashMap;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.di.bo.BusinessObject;
import com.di.controller.initbinder.DateBinder;
import com.di.service.AbstractService;
import com.di.toolkit.JacksonUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * 
 * @author di
 *
 * @param <T>数据库模型model
 * @param <E>mybatis的查询modelExample
 */
public abstract class AbstractController<T, E> {
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(Date.class, new DateBinder());
	}

	@RequestMapping(value = "/list.htm")
	public String list(BusinessObject bo, Model model) {
		PageHelper.startPage(bo.getPageNum(), bo.getPageSize());
		PageInfo<T> pageInfo = new PageInfo<T>(this.getAbstractService().selectByExample(this.getExample()));
		model.addAttribute("pageInfo", pageInfo);
		model.addAttribute("list", pageInfo.getList());
		model.addAttribute("pageNum", bo.getPageNum());
		model.addAttribute("pageSize", bo.getPageSize());
		return getPrefix() + "/list";
	}

	@ResponseBody
	@RequestMapping(path = { "/list.json" })
	public String list(BusinessObject bo) {
		PageHelper.startPage(bo.getPageNum(), bo.getPageSize());
		PageInfo<T> pageInfo = new PageInfo<T>(this.getAbstractService().selectByExample(this.getExample()));
		HashMap<String, Object> m = new HashMap<String, Object>();
		m.put("total", Long.valueOf(pageInfo.getTotal()));
		m.put("rows", pageInfo.getList());
		return JacksonUtil.pojoToJson(m);
	}

	@RequestMapping(value = "/show.htm")
	public String show(Integer id, Model model) {
		model.addAttribute("t", getAbstractService().selectByPrimaryKey(id));
		return getNamespace() + "/edit";
	}

	@RequestMapping(value = "/add.htm")
	public String add() {
		return getNamespace() + "/edit";
	}

	@RequestMapping(value = "/edit.htm")
	public String edit(T t) {
		int i = getAbstractService().updateByPrimaryKeySelective(t);
		if (i == 0)
			i = getAbstractService().insert(t);
		return "redirect:/" + getPrefix() + "/list.htm";
	}

	@RequestMapping(value = "/del.htm")
	public String del(Integer id) {
		getAbstractService().deleteByPrimaryKey(id);
		return "redirect:/" + getPrefix() + "/list.htm";
	}

	public abstract AbstractService<T, E> getAbstractService();

	public abstract String getNamespace();

	public abstract E getExample();

	private String getPrefix() {
		return getNamespace() == null ? "" : getNamespace();
	}

}
