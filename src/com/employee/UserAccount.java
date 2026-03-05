package com.employee;

public class UserAccount {
	private final String emailId;
	private final String password;
	
	public UserAccount(String email,String password){
		this.emailId = email;
		this.password = password;
	}
	
	public String getEmailId() {
		return emailId;
	}
	
	public String getPassword() {
		return password;
	}
	
}
