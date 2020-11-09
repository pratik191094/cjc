package com.cjc.service;

import com.cjc.model.User;

public interface HomeService {

	public void savadata(User u);
	public User login(String uname, String password);
	public Iterable<User> getAllData();
	public void delete(int uid);
	public User editdata(int uid);
	
}
