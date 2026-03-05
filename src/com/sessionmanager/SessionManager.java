package com.sessionmanager;
import java.util.HashMap;
import java.util.Map;

import com.employee.Employee;

public class SessionManager {
	private static SessionManager instance;
	private Map<String, Employee> sessions = new HashMap<>();

	
	public Map<String, Employee> getSessions() {
		return sessions;
	}

	public void setSessions(Map<String, Employee> sessions) {
		this.sessions = sessions;
	}
	
	public static SessionManager startSession() {
		if(instance==null) {
			instance =new SessionManager();
		}
		
		return instance;
	}
	
	public void endSession() {
		instance = null;
	}
	
	public void createSession(String token, Employee employee) {
		sessions.put(token, employee);
	}
	
	public boolean isValidSession(String token) {
		return sessions.containsKey(token);
	}
	
	public static boolean isSessionActive() {
		if(instance ==null)return false;
		else return true;
	}
}
