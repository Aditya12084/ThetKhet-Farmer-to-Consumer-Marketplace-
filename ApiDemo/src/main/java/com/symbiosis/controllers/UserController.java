package com.symbiosis.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.symbiosis.models.User;
import com.symbiosis.services.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/api/user/save")
	public User save(@RequestBody User user)
	{
		return userService.save(user);
	}
	
	@GetMapping("/api/users")
	public List<User> getAll()
	{
		return userService.getUsers();
	}
	
}
