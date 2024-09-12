package com.user.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.service.controller.request.Users;
import com.user.service.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public Users createUser(Users user) {
		return userRepository.save(user);
	}
	
	public List<Users> getAllUsers() {
		
		List<Users> usersList = userRepository.findAll();
		return usersList;
	}

}
