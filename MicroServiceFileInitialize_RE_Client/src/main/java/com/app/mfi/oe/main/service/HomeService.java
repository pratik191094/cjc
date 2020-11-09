package com.app.mfi.oe.main.service;



import com.app.mfi.oe.main.model.Customer;


public interface HomeService {
	public void savedata(Customer c);
	public void deletedata(int cust_id);
	public Iterable<Customer> getall();
	public Customer editdata(int cust_id);
	public Customer updatedata(Customer c);
	
	public Customer byMob(String mobno);
	public Customer byAdhar(String adharcard);
	public Customer byPan(String pancard);
	public Customer updatedatamin(Customer c);
//	public void saveDocumetDetails(MultipartFile[] files);

}
