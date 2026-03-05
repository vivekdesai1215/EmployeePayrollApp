package com.main;
import java.util.*;

import com.employee.Employee;
import com.employee.RegisterUser;
import com.validator.InvalidDataException;



public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee employee;
		System.out.println("WELCOME TO EMPLOYEE PAYROLL APP");
		System.out.println("-------------------------------");
		
		
		System.out.print("Login || SignUp ? ::: ");
		String choice = sc.nextLine();
			
		if(choice.equalsIgnoreCase("signup")) {
				try {
					employee = RegisterUser.register(sc);
				} catch (InvalidDataException e) {
					System.out.println(e.getMessage());
				}
		}else if(choice.equalsIgnoreCase("login")) {
				// login method call
		}else {
				System.out.println("Please enter a valid option ");
		}
	}

}
