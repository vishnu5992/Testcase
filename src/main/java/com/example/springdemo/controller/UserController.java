package com.example.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springdemo.model.User;
import com.example.springdemo.service.UserService;

@RestController
public class UserController {
  
	@Autowired
	private UserService service;
	@PostMapping(value = "/save")
	public User saveUser(@RequestBody User user) {
		return service.addUser(user);
	}
	
	@GetMapping(value="/getUser")
	public List<User> getUser(){
	
	   return service.getUser();
	}
}
