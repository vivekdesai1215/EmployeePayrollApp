package com.employee;

public class RegularEmployee extends Employee{
	public RegularEmployee(String name, String email, String phoneNo, int age, double salary, String empId, UserAccount account) {
        super(name, email, phoneNo, age, salary, empId, account);
    }

    @Override
    public String getRole() {
        return "RegularEmployee";
    }
}
