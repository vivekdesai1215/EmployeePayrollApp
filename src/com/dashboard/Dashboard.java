package com.dashboard;
import java.util.*;
import com.employee.Employee;
import com.payrollservice.PaySlip;


public interface Dashboard {
	void display(ArrayList<PaySlip> paySlipList, Employee employee);
}