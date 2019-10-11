package com.bridgelabz.service;

import com.bridgelabz.model.StudentLogin;
import com.bridgelabz.model.StudentRegistration;

public interface Service {
	
	int register(StudentRegistration registration);
	int login(StudentLogin login);

}
