package vn.its.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import vn.its.model.Fresher;

@Controller
public class LoginController {

	@RequestMapping(value = "login")
	public String showLogin(Model model) {
		model.addAttribute("fresher", new Fresher("tuan", "ntt12345"));
		return "login";
	}
}
