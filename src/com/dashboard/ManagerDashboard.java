package com.dashboard;

import java.util.ArrayList;
import java.util.Iterator;

import com.employee.Employee;
import com.payrollservice.PaySlip;

public class ManagerDashboard implements Dashboard{
	public void display(ArrayList<PaySlip> paySlipList,Employee employee) {
		System.out.println("\n==== MANAGER DASHBOARD ====");
		System.out.println("Manager  "+employee.getName());
		
		System.out.println("Dashboard Type: "+this.getClass().getName());
	
		double total = 0;
		Iterator it = paySlipList.iterator();
		while(it.hasNext()) {
			PaySlip p = (PaySlip) it.next();
			total += p.getNetPay();
		}
		
		System.out.println("\n Team total YTD Earnings: "+total);
	}
}
