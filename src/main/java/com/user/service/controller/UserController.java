package com.user.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.service.controller.request.Users;
import com.user.service.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/createUser")
	public ResponseEntity<String> createUser(@RequestBody Users user) {
		userService.createUser(user);
		return new ResponseEntity<String>("Success", HttpStatus.CREATED);
		
	}
	
	@GetMapping("/getAllUsers")
	public ResponseEntity<List<Users>> getAllUsers() {
		List<Users> usersList = userService.getAllUsers();
		usersList.forEach(x -> System.out.println(x.toString()));
		return new ResponseEntity<List<Users>>(usersList, HttpStatus.OK);
	}

}
