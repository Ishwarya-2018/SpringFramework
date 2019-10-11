package com.bridgelabz.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.bridgelabz.dao.StudentDao;
import com.bridgelabz.model.StudentLogin;
import com.bridgelabz.model.StudentRegistration;

@org.springframework.stereotype.Service
public class RegistrationServiceImpl implements Service{
	@Autowired
	private StudentDao dao;
	
	public void setDao(StudentDao dao)
	{
		this.dao=dao;
	}

	public int register(StudentRegistration registration) {
		int temp = dao.register(registration);
		return temp;
	}
		 
	 

	public int login(StudentLogin login) {
	int result = dao.login(login);
		return result;
	}

}
