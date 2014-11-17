package com.krew.dev;

import java.util.List;

import com.google.gson.Gson;

public class User {
	private final static Gson  GSON = new Gson();
	private List<User> friends;
	private Integer userId;
	private String firstName;
	private String lastName;
	//need to change to better format for phone
	private String phone;
	
	public void setUserId(Integer id) {
		this.userId = id;
	}
	
	public Integer getUserId() {
		return this.userId;
	}
	
	public void setFirstName(String fname) {
		this.firstName = fname;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public void setLastName(String lname) {
		this.lastName = lname;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	//need to change to better format for phone
	public void setPhone(String phone) {
		this.lastName = phone;
	}
	
	public String getPhone() {
		return this.phone;
	}
	
	public List<User> getFriends() {
		return this.friends;
	}
	
	public void setFriends(List<User> friends) {
		this.friends = friends;
	}
	
	public String toJson() {
		return GSON.toJson(this);
	}
	
	public static User fromJson(String json) {
		User e = GSON.fromJson(json, User.class);
		return e;
	}
	
	//look into mongo collections format..need to be able to create list of objects, if returned json array of serialized obj from db
	
}
