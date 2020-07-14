package com.kef.org.rest.model;

import java.util.List;

import com.kef.org.rest.model.MedicalandGreivance;

public class LoginInfo { 
	
	public LoginInfo() {
		
		// TODO Auto-generated constructor stub
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


	public Integer getIdgrevance() {
		return idgrevance;
	}
	public void setIdgrevance(Integer idgrevance) {
		this.idgrevance = idgrevance;
	}

	Integer idgrevance;
	public Volunteer getVolunteer() {
		return volunteer;
	}
	public void setVolunteer(Volunteer volunteer) {
		this.volunteer = volunteer;
	}
	public VolunteerAssignment getVolunteerassignment() {
		return volunteerassignment;
	}
	public void setVolunteerassignment(VolunteerAssignment volunteerassignment) {
		this.volunteerassignment = volunteerassignment;
	}
	Volunteer volunteer;
	VolunteerAssignment volunteerassignment;
	MedicalandGreivance  medicalandgreivance;
	List<GreivanceTracking> greivanceTrackingList;
	
	public List<GreivanceTracking> getGreivanceTrackingList() {
		return greivanceTrackingList;
	}
	public void setGreivanceTrackingList(List<GreivanceTracking> greivanceTrackingList) {
		this.greivanceTrackingList = greivanceTrackingList;
	}
	public MedicalandGreivance getMedicalandgreivance() {
		return medicalandgreivance;
	}
	public void setMedicalandgreivance(MedicalandGreivance medicalandgreivance) {
		this.medicalandgreivance = medicalandgreivance;
	}
	public Integer getLoginOTP() {
		return LoginOTP;
	}
	public void setLoginOTP(Integer loginOTP) {
		LoginOTP = loginOTP;
	}

}