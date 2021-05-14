package com.intjava.userservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.intjava.userservice.dto.UserRequest;
import com.intjava.userservice.model.User;
import com.intjava.userservice.model.repository.UserRepository;
import com.intjava.userservice.service.UserService;

@Service
public class UserServiceImpl implements UserService 
{

	@Autowired
	UserRepository repository;
	
	@Override
	public String createUser(UserRequest request) 
	{
		String statusmsg = "";
		User user = new User();
		
		user.setUser_id(request.getUser_id());
		user.setUser_firstname(request.getUser_firstname());
		user.setUser_lastname(request.getUser_lastname());
		user.setUser_age(request.getUser_age());
		user.setUser_address(request.getUser_address());
		
		repository.insert(user);
		statusmsg = "Data Inserted Successfully";
		
		
		return statusmsg;
		
	}

	@Override
	public List<User> getUser() 
	{
	 List<User> alluserdetails = repository.findAll();
	 for(User udetails : alluserdetails)
	 {
		 User ur = new User();
		 ur.setUser_id(udetails.getUser_id());
		 ur.setUser_firstname(udetails.getUser_firstname());
		 ur.setUser_lastname(udetails.getUser_lastname());
		 ur.setUser_age(udetails.getUser_age());
		 ur.setUser_address(udetails.getUser_address());
		 
	 }
	return alluserdetails;
			
	}

	@Override
	public void getbyIdUser() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateUser() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String deleteEmployee(int id) 
	{
		repository.deleteById(id);
		return "details deleted with id : " + id;
		
	}
}
