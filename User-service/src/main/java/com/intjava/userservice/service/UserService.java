package com.intjava.userservice.service;

import java.util.List;

import com.intjava.userservice.dto.UserRequest;
import com.intjava.userservice.model.User;

public interface UserService
{
	public String createUser(UserRequest request);
	
	public List<User> getUser();
	
	public void getbyIdUser();
	
	public void updateUser();
	
	public String deleteEmployee(int id);
	
}
