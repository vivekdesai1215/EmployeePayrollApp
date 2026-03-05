package com.dashboard;

public class DashboardFactory {
	public static Dashboard getDashboard(String role) {
		if(role.equalsIgnoreCase("regularemployee")) {
			return new EmployeeDashboard();
		}else if(role.equalsIgnoreCase("manager")) {
			return new ManagerDashboard();
		}
		
		return null;
	}
}