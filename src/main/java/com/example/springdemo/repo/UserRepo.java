package com.example.springdemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springdemo.model.User;

@Repository
public interface  UserRepo extends JpaRepository<User,String> {

}
