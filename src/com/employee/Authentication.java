package com.employee;
import com.main.Main;
import com.security.HashPassword;
import com.validator.InvalidDataException;



public class Authentication {
	public Employee authenticate(String email,String password) throws InvalidDataException{
		password = HashPassword.hashPassword(password);
		System.out.println("........");
		for(Employee user : Main.employeeList) {

			if(user.getEmail().equals(email) && user.getAccount().getPassword().equals(password)) {
				System.out.println("Login Successful !! ");
				System.out.println("---------------------------");
				return user;
			}
		}
		throw new InvalidDataException("Login Failed !! Invalid Credentials !! ");

	}
}
