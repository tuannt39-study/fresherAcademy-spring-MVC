package vn.its.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import vn.its.model.Fresher;
import vn.its.service.LoginService;

@Controller
public class LoginController {
	@Autowired
	private LoginService loginService;

	@RequestMapping(value = "login")
	public String showLogin(Model model) {
		model.addAttribute("fresher", new Fresher());
		return "login";
	}

	@RequestMapping(value = "dasboard")
	public String login(@ModelAttribute("fresher") Fresher fresher, Model model) {
		if (loginService.login(fresher)) {
			model.addAttribute("fresher", fresher);
			return "dasboard";
		} else {
			return "login";
		}
	}
}
