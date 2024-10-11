package com.kodbook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.kodbook.entities.User;
import com.kodbook.services.UserService;

@Controller
public class UserController {
	@Autowired
	UserService service;
	@PostMapping("/signUp")
	public String addUser(@ModelAttribute User user) {
		//first check user alredy exists or not, so code to check user is exists
		String username=user.getUsername();
		String email=user.getEmail();
		boolean status=service.userExists(username,email);
		if(status==false) {
			service.addUser(user);
		}
		return"index";
	}
	

}
