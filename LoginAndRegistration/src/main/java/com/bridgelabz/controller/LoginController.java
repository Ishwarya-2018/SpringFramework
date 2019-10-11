package com.bridgelabz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bridgelabz.model.StudentLogin;
import com.bridgelabz.service.Service;

@Controller
public class LoginController {
	
	@RequestMapping("/Login")
	public String loginPage()
	{
		System.out.println("inside cont");
		return "Login";
	}
	
	@Autowired
	 private Service service;
	@RequestMapping(value="/loginPage", method=RequestMethod.POST)
	public ModelAndView doLogin(@ModelAttribute StudentLogin student)
	{
		System.out.println("inside login");
		System.out.println("inside controller"+" "+student.getEmail());
		int result=service.login(student);
	if(result>0)
	{
		return new ModelAndView("LoginSucess");
	}
	else
	{ 
		return new ModelAndView("index"); 
	 
	}
	

	}
}
