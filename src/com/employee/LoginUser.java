package com.employee;
import java.util.*;

import com.validator.InvalidDataException;


public class LoginUser {
	public static Employee login(Scanner sc) {
		System.out.print("Enter Email : ");
		String email = sc.nextLine();
		Employee emp=null;
		System.out.print("Enter your password : ");
		String password = sc.nextLine();
		
		Authentication auth=new Authentication();
		try {
			 emp = auth.authenticate(email, password);
		}catch(InvalidDataException e){
			System.out.println(e.getMessage());
		}
		return emp;
		
	}
}
