package com.payrollservice;

import com.employee.Employee;

public class PrintPaySlip {
	
	private Employee employee;
	private SalaryComponents components;
	private String month;
	
	public PrintPaySlip(Employee employee, SalaryComponents components, String month) {
		super();
		this.employee = employee;
		this.components = components;
		this.month = month;
	}
	
	public String getMonth() {
		return month;
	}
	
	public double getNetPay() {
		return components.netPay;
	}

	public void setMonth(String month) {
		this.month = month;
	}



	public String toString() {
		return "\n===========PAYSLIP============\n"
				+"Month             : "+month+"\n"
				+"Employee Id       : "+employee.getEmpId()+"\n"
				+"Employee Name     : "+employee.getName()+"\n\n"
				+"-------Earnings---------\n"
				+"Basic Salary      : "+components.basicSalary+"\n"
				+"HRA               : "+components.hra+"\n"
				+"DA                : "+components.da+"\n"
				+"Allowances        : "+components.allowances+"\n\n"
				+"-------Deductions-------\n"
				+"PF                : "+components.pf+"\n"
				+"Tax               : "+components.tax+"\n"
				+"\n\n"
				+"Net Pay           : "+components.netPay+"\n"
				+"===============================\n";
	}
}
