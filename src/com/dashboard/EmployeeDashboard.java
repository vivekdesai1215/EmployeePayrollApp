package com.dashboard;
import java.util.*;
import com.employee.Employee;
import com.payrollservice.PaySlip;


public class EmployeeDashboard implements Dashboard{
	@SuppressWarnings("unchecked")
	public void display(ArrayList<PaySlip> paySlipList,Employee employee) {
		System.out.println("\n==== EMPLOYEE DASHBOARD ====");
		System.out.println("Welcome, "+employee.getName());
		
		System.out.println("Dashboard Type: "+this.getClass().getName());
		
		Collections.sort(paySlipList, new Comparator<PaySlip>(){
			public int compare(PaySlip o1, PaySlip o2) {
				PaySlip p1 = (PaySlip) o1;
				PaySlip p2 = (PaySlip) o2;
				return (int)(p2.getNetPay()-p1.getNetPay());
			}
		});
		
		System.out.println("\n recent PaySlips (top 3):");
		int count = 0;
		Iterator it = paySlipList.iterator();
		while(it.hasNext() && count<3) {
			PaySlip p = (PaySlip) it.next();
			System.out.println(p);
			count++;
		}
		
		double total = 0;
		Iterator it2 = paySlipList.iterator();
		while(it.hasNext()) {
			PaySlip p = (PaySlip) it2.next();
			total += p.getNetPay();
		}
		
		System.out.println("\n Year-To-Date Earnings: "+total);
		
	}
}