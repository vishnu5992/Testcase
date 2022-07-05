package com.example.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springdemo.model.User;
import com.example.springdemo.repo.UserRepo;

@Service
public class UserService {

	@Autowired
	private UserRepo repo;
	
	public User addUser(User user) {
		  return repo.save(user);
	}
	public List<User> getUser(){
		List<User> users = repo.findAll();
		return users;
	}
}
