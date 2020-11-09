package com.app.mfi.oe.main.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.mfi.oe.main.model.Customer;
import com.app.mfi.oe.main.service.HomeService;


@RestController
@CrossOrigin("*")
public class HomeController {
    
	@Autowired
	HomeService hs;
	

	@PostMapping("/reg")
	public String savedata(@RequestBody Customer c )
	{
		hs.savedata(c);
		return "Data Added Successfully";
		
		
	}
    @GetMapping("/get")
    public Iterable<Customer> getall()
    {
    Iterable<Customer> cust_list=hs.getall();
    return cust_list;
	
}
    @PutMapping("/put/{cust_id}")
	public Customer updatedata(@PathVariable int cust_id,@RequestBody Customer c)
	{
    	 Customer cust=hs.updatedata(c);
		
    	 return cust;
	}
    @RequestMapping(value = "/edit/{cut_id}",method = RequestMethod.GET)
	public Customer singledata(@PathVariable("cust_id") int cust_id) {
		Customer cust=hs.editdata(cust_id);
		 return cust;
	}

    @DeleteMapping("/del/{cust_id}")
	public void delete(@PathVariable int cust_id)
	{
		hs.deletedata(cust_id);
		System.out.println("Data Deleted");
	}
    @PatchMapping("/patch/{id}")
	public Customer updatemain(@PathVariable int cust_id, @RequestBody Customer c)
	{
		
		System.out.println(c.getCname());
	
	 return hs.updatedatamin(c);
	}
    @GetMapping("/searchm/{cust_mobno}")
    public Customer searchm(@PathVariable("cust_mobno") String mobno)
    {
    	Customer c=hs.byMob(mobno);
		return c;
    }
    @GetMapping("/searcha/{cust_adharcard}")
    public Customer searcha(@PathVariable("cust_adharcard") String adhar)
    {
    	Customer c=hs.byAdhar(adhar);
		return c;
    }
    @GetMapping("/searchp/{cust_pancard}")
    public Customer searchp(@PathVariable("cust_pancard") String pan)
    {
    	Customer c=hs.byPan(pan);
		return c;
    }
}
