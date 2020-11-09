package com.cjc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.model.User;
import com.cjc.service.HomeService;




@Controller
public class HomeController {

	@Autowired
	HomeService hs;
	
	@RequestMapping("/")
	public String prelogin() {
		
		return "login";
	}

	@RequestMapping("/reg")
	public String register() {
		return "register";
	}
	
	@RequestMapping("/register")
	public String register(@ModelAttribute User u) {
		
		hs.savadata(u);
		return "login";
	}
	
	@RequestMapping("/log")
	public String login(@RequestParam("uname") String username, @RequestParam("password") String password, Model m) {
		System.out.println(username);
		System.out.println(password);
		User u=	hs.login(username, password);
		
		if(u!=null)
		{
			     Iterable<User> list= hs.getAllData();
			     m.addAttribute("data",list);
			     return "success";
			     
		}
		
	return "login";	
	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam("uid") int uid, Model m) {
		
		hs.delete(uid);
		Iterable<User> list	=hs.getAllData();
		m.addAttribute("data",list);
		
		return "success";
	}
	
	@RequestMapping("/edit")
	public String editpage(@RequestParam("uid") int uid,Model m)
	{
		User u=hs.editdata(uid);
		m.addAttribute("data", u);
		
		return "edit";
}
	@RequestMapping("/update")
	public String update(@ModelAttribute User u, Model m) {
		
		hs.savadata(u);
		Iterable<User> list	=hs.getAllData();
		m.addAttribute("data",list);
		
		return "success";
	}
	
	@RequestMapping("/add")
	public String add() {
		return "register";
	}
}