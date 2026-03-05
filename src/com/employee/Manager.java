package com.employee;

public class Manager extends Employee{
	public Manager(String name, String email, String phoneNo, int age, double salary, String empId, UserAccount account) {
        super(name, email, phoneNo, age, salary, empId, account);
    }

    @Override
    public String getRole() {
        return "Manager";
    }
}
