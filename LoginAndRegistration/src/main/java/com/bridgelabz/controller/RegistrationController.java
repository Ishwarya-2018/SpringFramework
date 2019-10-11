package com.bridgelabz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bridgelabz.model.StudentRegistration;
import com.bridgelabz.service.Service;

@Controller
public class RegistrationController {

	@Autowired
	private Service service;

	@RequestMapping("/Registration")
	public String registrationPage() {
		System.out.println("inside cont");
		return "Registration";
	}

	@RequestMapping(value = "/registrationPage", method = RequestMethod.POST)
	public ModelAndView doRegistration(@ModelAttribute StudentRegistration student) {
		System.out.println("inside registration");
		System.out.println(student);
		int result = service.register(student);
		if (result > 0) {
			return new ModelAndView("RegistrationSucess");
		} else {
			return new ModelAndView("index");
		}
	}
}
