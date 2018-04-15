package vn.its.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import vn.its.model.Fresher;

@Controller
public class LoginController {

	@RequestMapping(value = "login")
	public ModelAndView showLogin() {
		ModelAndView view = new ModelAndView("login");
		view.addObject("fresher", new Fresher("tuan", "ntt12345"));
		return view;
	}
}
