package com.employee;
import java.util.*;

import com.validator.EmailValidator;
import com.validator.EmpIdValidator;
import com.validator.InvalidDataException;
import com.validator.NameValidator;
import com.validator.PhoneValidator;
import com.validator.Validator;


public class RegisterUser {
	public static Employee register(Scanner sc)throws InvalidDataException {
		Employee employee=null;
		try {
			Validator validator;
			System.out.println("Please create an User account ");
			System.out.println("");
			System.out.print("Enter your email : ");
			String email = sc.nextLine();
			validator = new EmailValidator();
			validator.validate(email);
			
			System.out.print("Enter your Password : ");
			String password = sc.nextLine();
			
			UserAccount user = new UserAccount(email,password);
			
			System.out.println("User account created successfully !! ");
			System.out.println("");
			
			System.out.println("Please Enter the Employee Details");
			System.out.println("");
			System.out.print("Enter Name : ");
			String name = sc.nextLine();
			validator = new NameValidator();
			validator.validate(name);
			
			System.out.print("Enter Phone No : ");
			String phoneNo = sc.nextLine();
			validator = new PhoneValidator();
			validator.validate(phoneNo);
			
			System.out.print("Enter Employee Id : format -(EMP_XXX) : ");
			String empId = sc.nextLine();
			validator = new EmpIdValidator();
			validator.validate(empId);
			
			System.out.print("Enter Age : ");
			int age = sc.nextInt(); sc.nextLine();
			if(age < 18 || age>100) throw new InvalidDataException("Age is Invalid ");
			
			System.out.print("Enter Salary : ");
			double salary = sc.nextInt();
			
			 employee =  new Employee( name,  email, phoneNo,  age,  salary,  empId, user); 

		}catch(InvalidDataException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("User Registration Successfull !! ");
		System.out.println("---------------------------------");
		System.out.println(employee.toString());
		return employee;
	}
}
