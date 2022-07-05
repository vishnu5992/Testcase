package com.example.springdemo;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.springdemo.model.User;
import com.example.springdemo.repo.UserRepo;
import com.example.springdemo.service.UserService;
@RunWith(SpringRunner.class)
@SpringBootTest
class SpringdemoApplicationTests {
    @Autowired 
    private UserService service;
    @MockBean
    private UserRepo repo;
    
	@Test
	public void addUser() {
		when(repo.findAll()).thenReturn(Stream.of(new User("1","ggh","john")).collect(Collectors.toList()));
		assertEquals(1,service.getUser().size());
	}

}
