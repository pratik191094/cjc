package com.cjc.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.model.User;

@Repository
public interface HomeRepository extends CrudRepository<User, Integer>{
	
	public User findAllByUnameAndPassword(String uname, String password);//must match with pojo fields.ie findAllBy-----

}
