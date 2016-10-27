package com.di.controller;

import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.di.interceptor.UserInfo;
import com.di.model.Module;
import com.di.model.User;
import com.di.service.AbstractService;
import com.di.service.ModuleService;
import com.di.service.UserService;

@Controller
@RequestMapping(value = "/user")
public class UserController extends AbstractController<User> {
	@Autowired
	private UserService userService;
	@Autowired
	private ModuleService moduleService;

	@Override
	public AbstractService<User> getAbstractService() {
		return userService;
	}

	@Override
	public String getNamespace() {
		return "user";
	}

	@Override
	public ModelAndView edit(User t) {
		ModelAndView view=new ModelAndView("redirect:/user/list.do");
		if (t.getUserId() != null) {
			userService.update(t);
		}else{
			if(userService.selectUserByUsername(t.getUserName())!=null){
				view.addObject("t", t);
				view.setViewName("user/edit");
			}else{
				userService.insert(t);
			}
		}
		return view;
	}

	@RequestMapping(value = "login.do")
	public ModelAndView login(HttpServletRequest req, String userName, String password) {
		User u = userService.selectUserByUsername(userName);
		u = userService.select(1);
		ModelAndView view = new ModelAndView("redirect:/role/list.do");
		if (u == null) {
		} else {
			UserInfo ui = new UserInfo();
			Map<String, String> authority = new HashMap<String, String>();
			for (Module m : moduleService.selectModuleByUserId(u.getUserId())) {
				authority.put(m.getModuleCode(), m.getModuleName());
			}
			ui.setAuthority(authority);
			req.getSession(true).setAttribute("userInfo", ui);
		}
		return view;
	}
}
