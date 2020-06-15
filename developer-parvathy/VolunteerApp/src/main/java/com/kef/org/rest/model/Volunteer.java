package com.kef.org.rest.model;

public class Volunteer {

   


    public Volunteer(String volunteerId, String phoneNo) {
		super();
		this.volunteerId = volunteerId;
		this.phoneNo = phoneNo;
	}


	public String getVolunteerId() {
		return volunteerId;
	}
	public void setVolunteerId(String volunteerId) {
		this.volunteerId = volunteerId;
	}
	public String getphoneNo() {
		return phoneNo;
	}
	public void setphoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}


	private String volunteerId;
    private String phoneNo;
    
    
   
   
}
