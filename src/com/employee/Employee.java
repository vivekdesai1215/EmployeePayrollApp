package com.employee;

public class Employee {
	private String name;
	private String email;
	private String phoneNo;
	private int age;
	private double salary;
	private String empId;
	
	private UserAccount account;
	

	public Employee(String name, String email, String phoneNo, int age, double salary, String empId,
			UserAccount account) {
		super();
		this.name = name;
		this.email = account.getEmailId();
		this.phoneNo = phoneNo;
		this.age = age;
		this.salary = salary;
		this.empId = empId;
		this.account = account;
	}

	public UserAccount getAccount() {
		return account;
	}
	
	public void setAccount(UserAccount account) {
		this.account = account;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	

	@Override
	public String toString() {
	    return "Employee Details " +
	           "EmpId='" + empId + '\'' +
	           ", Name='" + name + '\'' +
	           ", Email='" + email + '\'' +
	           ", PhoneNo='" + phoneNo + '\'' +
	           ", Age=" + age +
	           ", Salary=" + salary 
	           ;
	}

}
