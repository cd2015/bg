package com.bg.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	@RequestMapping("/login")
	public String loginPage(){
		return "user/login";
	}
	
	@RequestMapping("/register")
	public String registerPage(){
		return "user/register";
	}
}
