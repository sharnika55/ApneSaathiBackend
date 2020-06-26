package com.kef.org.rest.controller;



import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.kef.org.rest.model.LoginInfo;
import com.kef.org.rest.model.Volunteer;
import com.kef.org.rest.model.SeniorCitizen;
import com.kef.org.rest.repository.SeniorCitizenRepository;
import com.kef.org.rest.service.VolunteerService;

@RestController
 
public class VolunteerController 
{
	
	public static final Logger logger = LoggerFactory.getLogger(VolunteerController.class);

    
    @Autowired
    VolunteerService volunteerService; 
    
    @Autowired
	private SeniorCitizenRepository seniorcitizenRespository;
	
   
    @RequestMapping(value = "/LoginVolunteer", method = RequestMethod.POST,consumes = "application/json", produces = "application/json")
    public ResponseEntity<LoginInfo>  checkVolunteermobile(@RequestBody Volunteer volunteer)
    { String phoneNo = volunteer.getphoneNo();
     logger.info("phoneNo" +phoneNo); 
    	LoginInfo loginInfo = new LoginInfo();
    	if((volunteerService.findvolunteerId(phoneNo)) != null )
    	{
    		loginInfo.setMessage("Success"); 
    		loginInfo.setStatusCode("0");
  		  loginInfo.setVolunteerId(volunteerService.findvolunteerId(phoneNo));
  		  return new ResponseEntity<LoginInfo>(loginInfo, HttpStatus.OK);
    		
    	}else {
		  logger.info("Reached here"); 
		  loginInfo.setMessage("Failure");
		  loginInfo.setStatusCode("1"); 		  
		  loginInfo.setVolunteerId(volunteerService.findvolunteerId(phoneNo));
		  return new ResponseEntity<LoginInfo>(loginInfo, HttpStatus.CONFLICT); }
		 
    	
    	
    	
    }
    
    @RequestMapping(value = "/VolunteerData", method = RequestMethod.POST,consumes = "application/json", produces = "application/json")
    public ResponseEntity<Volunteer>  VolunteerDetailsbymobile(@RequestBody Volunteer volunteer)
    {
    		String phoneNo = volunteer.getphoneNo();
    		Volunteer v1 = volunteerService.findvolunteerDetails(phoneNo);
    		if(v1.getVolunteerId().equals(null))
    		{
    		 return new ResponseEntity<Volunteer>(v1, HttpStatus.OK);
    		}
    		else {
    			return new ResponseEntity<Volunteer>(v1, HttpStatus.CONFLICT);
    		}
    		
    	
    	
    }
    
    @RequestMapping(value = "/NewSrCitizenRegistration", method = RequestMethod.POST,consumes = "application/json", produces = "application/json")
    public ResponseEntity<SeniorCitizen>  registerNewSrCitizen(@RequestBody SeniorCitizen seniorcitizen)
    {
    		
    	
    	 return new ResponseEntity<SeniorCitizen>(seniorcitizenRespository.save(seniorcitizen), HttpStatus.OK);	
    }
   
}
