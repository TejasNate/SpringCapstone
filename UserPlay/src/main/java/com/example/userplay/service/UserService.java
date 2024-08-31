package com.example.userplay.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.userplay.model.User;
import com.example.userplay.repo.UserRepository;

import java.util.List;



@Service
public class UserService {

 @Autowired
 private UserRepository userRepository;

 public User registerUser(User user) {
     return userRepository.save(user);
 }

 public User findByUsername(String username) {
     return userRepository.findByUsername(username);
 }

public List<User> getAllUsers() {
	// TODO Auto-generated method stub
	return null;
}

public User login(String username, String password) {
	// TODO Auto-generated method stub
	return null;
}

 
}