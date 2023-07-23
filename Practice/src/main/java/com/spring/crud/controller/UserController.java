package com.spring.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.crud.entity.User;
import com.spring.crud.request.UserRequest;
import com.spring.crud.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userService;
	
	@PostMapping("/addUser")
	public ResponseEntity<User> createUser(@RequestBody UserRequest userRequest) {

		try {
			User user = userService.addUser(userRequest);
			return new ResponseEntity<>(user, HttpStatus.ACCEPTED);
		} catch (Exception e) {
			return new ResponseEntity<>(new User(), HttpStatus.BAD_REQUEST);
		}

	}
	
	@GetMapping("/getUser/{id}")
	public ResponseEntity<User> getUserbyId(@PathVariable Long id)
	{
	  User user=	userService.findById(id);
		 return new ResponseEntity<>(user, HttpStatus.ACCEPTED);
		
	}
	
	@GetMapping("/findall")
	public ResponseEntity<List<User>> findAll()
	{
	 List<User> user=	userService.findALLUserList();
		 return new ResponseEntity<>(user, HttpStatus.ACCEPTED);
		
	}

}
