package com.kef.org.rest.model;

public class LoginInfo { 
	
	public LoginInfo() {
		
		// TODO Auto-generated constructor stub
	}
	public LoginInfo(String statusCode, String message, String volunteerId) {
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
	public String getVolunteerId() {
		return volunteerId;
	}
	public void setVolunteerId(String volunteerId) {
		this.volunteerId = volunteerId;
	}
	String message;
	String volunteerId;

}
