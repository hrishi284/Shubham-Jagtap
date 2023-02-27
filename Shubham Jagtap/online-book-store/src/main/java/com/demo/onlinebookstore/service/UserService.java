package com.demo.onlinebookstore.service;

import java.util.List;

import com.demo.onlinebookstore.entity.User;

public interface UserService {

	public List<User> getAllUsers();
	
	public User getUserByUsername(String username);
}
