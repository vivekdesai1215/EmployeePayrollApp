package com.payrollservice;

import com.employee.Employee;

public final class PaySlip implements Cloneable{
	private final String empId;
	private final String empName;
	private final String month;
	private final double netPay;
	public PaySlip(String empId, String empName, String month, double netPay) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.month = month;
		this.netPay = netPay;
	}
	public String getEmpId() {
		return empId;
	}
	public String getEmpName() {
		return empName;
	}
	public String getMonth() {
		return month;
	}
	public double getNetPay() {
		return netPay;
	}
	
	public Object clone() {
		return new PaySlip(empId,empName,month,netPay);
	}
	
	@Override
	public boolean equals(Object o) {
	    if (this == o) return true;
	    if (o == null || getClass() != o.getClass()) return false;

	    PaySlip other = (PaySlip) o;  // cast to PaySlip
	    boolean check = empId != null && empId.equals(other.getEmpId()) 
	                    && month.equals(other.getMonth());
	    if (check) {
	        System.out.println("Verified: Download copy is equal to original.");
	    } else {
	        System.out.println("Alert: Download copy is not equal to Original.");
	    }
	    return check;
	}

	
	@Override
	public int hashCode() {
		int result = 17;
		result = 31*result+empId.hashCode();
		result = 31*result+month.hashCode();
		return result;
	}
	
	public String toString() {
		return "PAYSLIP\n"
				+"Employee ID      : "+empId+"\n"
				+"Employee Name    : "+empName+"\n"
				+"Month            : "+month+"\n"
				+"Net Pay          : "+netPay+"\n";
	}
	
}
