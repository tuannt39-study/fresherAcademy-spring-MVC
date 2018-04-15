package vn.its.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import vn.its.model.Fresher;
import vn.its.service.RegisterService;

@Controller
public class RegisterController {
	@Autowired
	private RegisterService registerService;

	@RequestMapping(value = "register")
	public String showRegister(Model model) {
		model.addAttribute("fresher", new Fresher());
		return "register";
	}

	@RequestMapping(value = "userRegister")
	public String register(@ModelAttribute("fresher") Fresher fresher, Model model) {
		if (registerService.register(fresher)) {
			model.addAttribute("fresher", fresher);
			return "redirect: login";
		} else {
			model.addAttribute("error", true);
			return "redirect: register";
		}
	}

}
