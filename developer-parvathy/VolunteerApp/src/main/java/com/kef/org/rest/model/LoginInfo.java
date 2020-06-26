package com.kef.org.rest.model;

public class LoginInfo { 
	
	public LoginInfo() {
		
		// TODO Auto-generated constructor stub
	}
	public LoginInfo(String statusCode, String message, Integer volunteerId) {
		super();
		this.statusCode = statusCode;
		this.message = message;
		this.volunteerId = volunteerId;
	}
	String statusCode;
	public String getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Integer getVolunteerId() {
		return volunteerId;
	}
	public void setVolunteerId(Integer volunteerId) {
		this.volunteerId = volunteerId;
	}
	String message;
	Integer volunteerId;
	Integer LoginOTP;
	public Integer getLoginOTP() {
		return LoginOTP;
	}
	public void setLoginOTP(Integer loginOTP) {
		LoginOTP = loginOTP;
	}

}