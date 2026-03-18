package com.symbiosis.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.symbiosis.models.User;
import com.symbiosis.repos.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;
	
	public List<User> getUsers()
	{
		return repo.findAll();
	}
	
	public User save(User user)
	{
		return repo.save(user);
	}
	
}
