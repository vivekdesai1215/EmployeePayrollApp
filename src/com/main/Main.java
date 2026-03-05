package com.main;
import java.io.IOException;
import java.util.*;

import com.employee.Employee;
import com.employee.LoginUser;
import com.employee.Manager;
import com.employee.RegisterUser;
import com.employee.RegularEmployee;
import com.employee.UserAccount;
import com.payrollservice.PrintPaySlip;
import com.payrollservice.FileService;
import com.payrollservice.GeneratePaySlip;
import com.payrollservice.PaySlip;
import com.payrollservice.PayrollService;
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
		Employee employee = null;
		System.out.println("WELCOME TO EMPLOYEE PAYROLL APP");
		System.out.println("-------------------------------");
		
		PaySlip payslip = null;
		PrintPaySlip paySlip=null;
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
			System.out.println(" 1. View Profile Info \n 2. Generate PaySlip \n 3. Print PaySlip \n 4. Update Profile ");
			System.out.print("------Please Select your choice : ");
			int op = sc.nextInt();
			sc.nextLine();
			
			switch(op) {
				case 1:{
					System.out.println(employee);
					break;
				}
				case 2:{
					GeneratePaySlip generate= new GeneratePaySlip();
					paySlip = generate.generatePaySlip(sc,employee);
					break;
				}
				case 3:{
					if(paySlip==null) {
						GeneratePaySlip generate= new GeneratePaySlip();
						paySlip = generate.generatePaySlip(sc,employee);
					}
					payslip = new PaySlip(employee.getEmpId(),employee.getName(),paySlip.getMonth(),paySlip.getNetPay());
					System.out.println("Original PaySlip: ");
					System.out.println("");
					System.out.println(payslip);
					PaySlip paySlipClone =(PaySlip) payslip.clone();
					payslip.equals(paySlipClone);
					System.out.println("\n\n PaySlip Download Successful.");
					try {
						String textFile = FileService.savePaySlipAsText(payslip);
						System.out.println("Saved as text file : "+textFile);
						String pdfFile = FileService.savePaySlipAsPdf(payslip);
						System.out.println("Saved as PDF file: "+pdfFile);
					}catch(IOException e) {
						System.out.println(e.getMessage());
					}
					
					break;
				}
			}
		}
	}

}
