package com.kodbook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavigationController {
	@GetMapping("/")
	public String index() {
		return"index";
	}
	@GetMapping("/openSignUp")
	public String openSignUp() {
		return"signUp";
	}
	@GetMapping("/openLogin")
	public String openLogin() {
		return"home";
	}
	@GetMapping("/openResetPassword")
	public String openResetPassword() {
		return"resetPassword";
	}
	@GetMapping("/openCreatePost")
	public String openCreatePost() {
		return"createPost";
	}

}
