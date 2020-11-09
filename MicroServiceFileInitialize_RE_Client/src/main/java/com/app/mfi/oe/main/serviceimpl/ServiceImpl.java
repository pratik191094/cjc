package com.app.mfi.oe.main.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.mfi.oe.main.model.Customer;
import com.app.mfi.oe.main.repository.HomeRespository;
import com.app.mfi.oe.main.service.HomeService;


@Service
public class ServiceImpl implements HomeService {

	@Autowired
	HomeRespository hr;

	@Override
	public void savedata(Customer c) {
		hr.save(c);
		
	}

	@Override
	public void deletedata(int cust_id) {
		
		hr.deleteById(cust_id);
	}

	@Override
	public Iterable<Customer> getall() {
		
		return hr.findAll();
	}

	@Override
	public Customer editdata(int cust_id) {
	
		return hr.findById(cust_id).get();
	}

	@Override
	public Customer updatedata(Customer c) {
		
		return hr.save(c);
	}

	@Override
	public Customer byMob(String mobno) {
		
		return hr.findByCust_mobno(mobno);
	}

	@Override
	public Customer byAdhar(String adharcard) {
	
		return hr.findByCust_adharcard(adharcard);
	}

	@Override
	public Customer byPan(String pancard) {
	
		return hr.findByCust_pancard(pancard);
	}

	@Override
	public Customer updatedatamin(Customer c) {
		
		return hr.save(c);
	}

}
