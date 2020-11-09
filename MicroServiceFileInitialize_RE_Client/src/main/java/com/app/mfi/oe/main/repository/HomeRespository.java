package com.app.mfi.oe.main.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.mfi.oe.main.model.Customer;

@Repository
public interface HomeRespository  extends CrudRepository<Customer, Integer> {

	@Query("from Customer where cust_mobno=:mobno")
	public Customer findByCust_mobno(String mobno);
    
	@Query("from Customer where cust_adharcard=:adharcard")
	public Customer findByCust_adharcard(String adharcard);
	
	@Query("from Customer where cust_pancard=:pancard")
	public Customer findByCust_pancard(String pancard);
	
	@Query("from Customer where cname=:cname")
	public Customer findByCname(String cname);

	 

}
