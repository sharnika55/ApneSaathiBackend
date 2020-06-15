package com.kef.org.rest.service;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kef.org.rest.interfaces.VolunteerInterface;

import com.kef.org.rest.model.Volunteer;

import com.kef.org.rest.dao.VolunteerDAO;
import com.kef.org.rest.exception.ResponseCode;
@Service("volunteerService")
public class VolunteerService implements VolunteerInterface{
	
	 
	
	private static List<Volunteer> volunteerlist;
	static{
		volunteerlist= VolunteerDAO.populateDummyVoluteerData();
    }
	
	public String  isVolunteerRegistered(String phone_no)
	{
		        for(Volunteer volunteer : volunteerlist){
		            if(volunteer.getphoneNo().equals(phone_no) ){
		               return volunteer.getVolunteerId();
		            }
		           
		            
		        }
		       
		        return null; 
		   
	}
	
	
}
