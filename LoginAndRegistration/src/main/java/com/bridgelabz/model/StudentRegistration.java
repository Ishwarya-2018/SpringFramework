package com.bridgelabz.model;

public class StudentRegistration {
	
	private String name;
	private String password;
	private String email;
	private String mobno;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobno() {
		return mobno;
	}
	public void setMobno(String mobno) {
		this.mobno = mobno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "StudentRegistration [name=" + name + ", mobno=" + mobno + ", email=" + email + ", password=" + password
				+ "]";
	}
	
	
	 
}
