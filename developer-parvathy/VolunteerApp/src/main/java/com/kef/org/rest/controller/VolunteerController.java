package com.kef.org.rest.controller;

import java.net.URI;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;


import com.kef.org.rest.dao.VolunteerDAO;
import com.kef.org.rest.model.LoginInfo;
import com.kef.org.rest.model.Volunteer;
import com.kef.org.rest.service.VolunteerService;

@RestController

public class VolunteerController 
{
	
	public static final Logger logger = LoggerFactory.getLogger(VolunteerController.class);
    @Autowired
    private VolunteerDAO VolunteerDao;
    
    @Autowired
    VolunteerService volunteerService; 
    

    @GetMapping(value = "/LoginVolunteer/{phoneNo}")
    public ResponseEntity<LoginInfo>  checkVolunteermobile(@PathVariable("phoneNo") String phoneNo)
    {
    	logger.info("The phone number received is", phoneNo);
    LoginInfo loginInfo = new LoginInfo();
          if((volunteerService.isVolunteerRegistered(phoneNo))  != null )
      {
        	  
        	 
        	 loginInfo.setMessage("Success");
        	 loginInfo.setStatusCode("0");
        	 loginInfo.setVolunteerId(volunteerService.isVolunteerRegistered(phoneNo));
        	  return new ResponseEntity<LoginInfo>(loginInfo, HttpStatus.OK);
      }else {
    	  logger.info("Reached here");
    	  loginInfo.setMessage("Failure");
     	 loginInfo.setStatusCode("1");
     	 logger.info("Reached here" + volunteerService.isVolunteerRegistered(phoneNo));
     	 loginInfo.setVolunteerId(volunteerService.isVolunteerRegistered(phoneNo));
    	  return new ResponseEntity<LoginInfo>(loginInfo, HttpStatus.CONFLICT);
      }
    }
    
   
}
