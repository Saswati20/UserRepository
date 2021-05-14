package com.intjava.userservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection ="User")
public class User 
{
	@Id
	int user_id;
	String user_firstname;
	String user_lastname;
	int user_age;
	String user_address;
	
	
	public User() 
	{

	}
	
	
	public User(int user_id, String user_firstname, String user_lastname, int user_age, String user_address) {
		super();
		this.user_id = user_id;
		this.user_firstname = user_firstname;
		this.user_lastname = user_lastname;
		this.user_age = user_age;
		this.user_address = user_address;
	}
	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", user_firstname=" + user_firstname + ", user_lastname=" + user_lastname
				+ ", user_age=" + user_age + ", user_address=" + user_address + "]";
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUser_firstname() {
		return user_firstname;
	}
	public void setUser_firstname(String user_firstname) {
		this.user_firstname = user_firstname;
	}
	public String getUser_lastname() {
		return user_lastname;
	}
	public void setUser_lastname(String user_lastname) {
		this.user_lastname = user_lastname;
	}
	public int getUser_age() {
		return user_age;
	}
	public void setUser_age(int user_age) {
		this.user_age = user_age;
	}
	public String getUser_address() {
		return user_address;
	}
	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}
	
	
	
	

}
