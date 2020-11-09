package com.cjc.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.model.User;
import com.cjc.repository.HomeRepository;
import com.cjc.service.HomeService;

@Service
public class ServiceImpl implements HomeService {

	@Autowired
	HomeRepository hr;
	
	@Override
	public void savadata(User u) {
		
		hr.save(u);
		
	}

	@Override
	public User login(String uname, String password) {
		
		return hr.findAllByUnameAndPassword(uname, password);
		
	}

	@Override
	public Iterable<User> getAllData() {
		
		return hr.findAll();
	}

	@Override
	public void delete(int uid) {
		
		 hr.deleteById(uid);
	}

	@Override
	public User editdata(int uid) {
		
		return hr.findById(uid).get();
	}

}
