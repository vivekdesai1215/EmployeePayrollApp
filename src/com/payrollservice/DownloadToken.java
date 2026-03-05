package com.payrollservice;

public class DownloadToken {
	private long createdTime;
	private long expiry;
	
	public DownloadToken() {
		createdTime = System.currentTimeMillis();
		expiry = 60*1000;
	}
	
	public boolean isExpired() {
		long now = System.currentTimeMillis();
		return (now - createdTime) > expiry;
	}
}
