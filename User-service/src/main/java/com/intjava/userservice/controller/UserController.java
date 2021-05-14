package com.intjava.userservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.intjava.userservice.dto.UserRequest;
import com.intjava.userservice.model.User;
import com.intjava.userservice.model.repository.UserRepository;
import com.intjava.userservice.service.impl.UserServiceImpl;

@RestController
public class UserController 
{
	@Autowired
	UserServiceImpl service;
	UserRepository repository;
	
	@PostMapping("/createUserData")
	public void createUserData(@RequestBody UserRequest request)
	{
		service.createUser(request);
	}
	@GetMapping("/getUserData")
	public List<User> getUser() 
	{
		return service.getUser();
	}
	@GetMapping("/getUserDataById")
	public void getbyIdUserData()
	{
		service.getbyIdUser();
	}
	@PutMapping("/updateUserData")
	public void updateUserData()
	{
		service.updateUser();
	}
	@DeleteMapping("/deleteUserData/{id}")
	public String deleteEmployeeData(@PathVariable int id)
	{
		return service.deleteEmployee(id);
	}
}
