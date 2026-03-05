package com.main;
import java.util.*;

import com.employee.Employee;
import com.employee.LoginUser;
import com.employee.Manager;
import com.employee.RegisterUser;
import com.employee.RegularEmployee;
import com.employee.UserAccount;
import com.security.HashPassword;
import com.validator.InvalidDataException;



public class Main {
	public static List<Employee> employeeList = new ArrayList<>();
	
	static {
		UserAccount account01 = new UserAccount("vivek@gmail.com",HashPassword.hashPassword("vivek1010"));
		Employee user01 = new Manager("Vivek","vivek@gmail.com","7204760809",21,20000000, "EMP-101",account01);
		UserAccount account02 = new UserAccount("shreyas@gmail.com",HashPassword.hashPassword("shreyas1010"));
		Employee user02 = new RegularEmployee("Shreyas","shreyas@gmail.com","7204760809",20,20000000, "EMP-102",account02);
		
		employeeList.add(user01);
		employeeList.add(user02);
//		Contacts contacts01 = new Contacts( "tempo", "9191919191","shreyas@gmail.com",Tag.FAMILY,LocalDate.now());
//		Contacts contacts02 = new Contacts("tempooooo","7204760809","hey@gmail.com",Tag.FRIEND,LocalDate.now());
//		userContacts.put(user01, new ArrayList<>(Arrays.asList(contacts01,contacts02)));
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee employee;
		System.out.println("WELCOME TO EMPLOYEE PAYROLL APP");
		System.out.println("-------------------------------");
		
		
		System.out.print("Login || SignUp ? ::: ");
		String choice = sc.nextLine();
		
		boolean isLoggedIn = false;
		if(choice.equalsIgnoreCase("signup")) {
				try {
					employee = RegisterUser.register(sc);
				} catch (InvalidDataException e) {
					System.out.println(e.getMessage());
				}
		}else if(choice.equalsIgnoreCase("login")) {
				employee = LoginUser.login(sc);
				System.out.println(employee);
				isLoggedIn = true;
		}else {
				System.out.println("Please enter a valid option ");
		}
		
		
		if(isLoggedIn) {
			System.out.println("");
			System.out.println("---------EMPLOYEE DASHBOARD---------");
			System.out.println("");
			System.out.println(" 1. View Profile Info \n 2. View PaySlip \n 3. Update profile ");
			System.out.print("------Please Select your choice : ");
			int op = sc.nextInt();
			sc.nextLine();
			
			
		}
	}

}
