package com.payrollservice;
import java.util.*;

import com.employee.Employee;


public class GeneratePaySlip {
	public PrintPaySlip generatePaySlip(Scanner sc,Employee employee) {
		System.out.println("");
		System.out.println("------Generate Your PaySlip------");
		System.out.print("Enter Month (ex - March 2026 : )");
		String month = sc.nextLine();
		System.out.print("Enter Basic Salary : ");
		double basic = sc.nextDouble();sc.nextLine();
		System.out.print("Enter HRA : ");
		double hra = sc.nextDouble();sc.nextLine();
		System.out.print("Enter DA : ");
		double da = sc.nextDouble();sc.nextLine();
		System.out.print("Allowances : ");
		double Allowances = sc.nextDouble(); sc.nextLine();
		PrintPaySlip payslip = PayrollService.generatePaySlip(employee, month, basic, hra, da, Allowances);
		System.out.println("");
		System.out.println(payslip);
		
		return payslip;
	}
}
