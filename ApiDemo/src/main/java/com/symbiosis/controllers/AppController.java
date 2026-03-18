package com.symbiosis.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

	@GetMapping("/")
	public String index() {
		return "user-form";
	}
	
	@GetMapping("/users")
	public String showUsers()
	{
		return "user-list";
	}
	
}
