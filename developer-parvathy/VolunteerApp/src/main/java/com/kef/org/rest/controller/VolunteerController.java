package com.kef.org.rest.controller;



import java.util.Map;
import java.util.Optional;

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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.kef.org.rest.model.LoginInfo;
import com.kef.org.rest.model.MedicalandGreivance;
import com.kef.org.rest.model.Volunteer;
import com.kef.org.rest.model.VolunteerAssignment;  
import com.kef.org.rest.repository.MedicalandGreivanceRepository;
import com.kef.org.rest.repository.VolunteerAssignmentRepository;
import com.kef.org.rest.repository.VolunteerRepository;
import com.kef.org.rest.service.MedicalandGreivanceService;
import com.kef.org.rest.service.VolunteerService;

@RestController
 
public class VolunteerController 
{
	
	public static final Logger logger = LoggerFactory.getLogger(VolunteerController.class);

    
    @Autowired
    VolunteerService volunteerService; 
    
    
    
    @Autowired
    MedicalandGreivanceService medicalandgreivanceservice; 

    
    @Autowired
	private MedicalandGreivanceRepository medicalandgreivanceRespository;
    
    @Autowired
   	private VolunteerAssignmentRepository volunteerassignmentRespository;
    

    
    @Autowired
	private VolunteerRepository volunteerRespository;
	
   
    @RequestMapping(value = "/LoginVolunteer", method = RequestMethod.POST,consumes = "application/json", produces = "application/json")
    @ResponseBody
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
    @ResponseBody
    public ResponseEntity<LoginInfo>  VolunteerDetailsbymobile(@RequestBody Volunteer volunteer)
    {LoginInfo loginInfo = new LoginInfo();
    		String phoneNo = volunteer.getphoneNo();
    		Volunteer v1 = volunteerService.findvolunteerDetails(phoneNo);
    		if(v1.getIdvolunteer().equals(null))
    		{   
    			loginInfo.setMessage("Failure");
    			loginInfo.setStatusCode("1"); 
    			  return new ResponseEntity<LoginInfo>(loginInfo, HttpStatus.CONFLICT);
    			
    		}
    		else {
    			loginInfo.setMessage("Success"); 
        		loginInfo.setStatusCode("0");
    			loginInfo.setVolunteer(v1);
    			 return new ResponseEntity<LoginInfo>(loginInfo, HttpStatus.OK);
    		}
    		
    	
    	
    }

    
    
    @RequestMapping(value = "/loadDashboard", method = RequestMethod.POST,consumes = "application/json", produces = "application/json")
    @ResponseBody
    public  ResponseEntity<LoginInfo>  loadVolunteerDashboard(@RequestBody Volunteer volunteer)
    {
    	LoginInfo loginInfo = new LoginInfo();
    	Optional<Volunteer> v1	= volunteerRespository.findById(volunteer.getIdvolunteer());
    	if(v1.isPresent()) {
    		loginInfo.setMessage("Success"); 
    		loginInfo.setStatusCode("0");
			loginInfo.setVolunteer(v1.get());
			 return new ResponseEntity<LoginInfo>(loginInfo, HttpStatus.OK);
    		
    	}else {
    		loginInfo.setMessage("Failure");
			loginInfo.setStatusCode("1"); 
			  return new ResponseEntity<LoginInfo>(loginInfo, HttpStatus.CONFLICT);
    	}
}
    
    @RequestMapping(value = "/seniorcitizenDetails", method = RequestMethod.POST,consumes = "application/json", produces = "application/json")
    @ResponseBody
    public ResponseEntity<LoginInfo>  getseniorcitizendetails(@RequestBody VolunteerAssignment volunteerassignement)
    {
    	LoginInfo loginInfo = new LoginInfo();
		
		  Optional<VolunteerAssignment> v1 =  volunteerassignmentRespository.findById(volunteerassignement.getCallid());
		  if(v1.isPresent()) {
		  loginInfo.setMessage("Success");
		  loginInfo.setStatusCode("0"); 
		  loginInfo.setVolunteerassignment(v1.get());
		  return new ResponseEntity<LoginInfo>(loginInfo, HttpStatus.OK);
		  
		  }else { 
			  loginInfo.setMessage("Failure"); 
			  loginInfo.setStatusCode("1"); 
			  return new ResponseEntity<LoginInfo>(loginInfo, HttpStatus.CONFLICT);
		  
		  }
		 
    	
    	
    	
    	
    }
    
    @RequestMapping(value = "/getcalldetails", method = RequestMethod.POST,consumes = "application/json", produces = "application/json")
    @ResponseBody
    public ResponseEntity<LoginInfo>  getseniorcitizencalldetails(@RequestBody MedicalandGreivance medicalgreivance)
    {
    	LoginInfo loginInfo = new LoginInfo();
		
		  Optional<MedicalandGreivance> mg1 =  medicalandgreivanceRespository.findById(medicalgreivance.getIdgrevance());
		  if(mg1.isPresent()) {
		  loginInfo.setMessage("Success");
		  loginInfo.setStatusCode("0"); 
		  loginInfo.setMedicalandgreivance(mg1.get());
		  return new ResponseEntity<LoginInfo>(loginInfo, HttpStatus.OK);
		  
		  }else { 
			  loginInfo.setMessage("Failure"); 
			  loginInfo.setStatusCode("1"); 
			  return new ResponseEntity<LoginInfo>(loginInfo, HttpStatus.CONFLICT);
		  
		  }
		 
    	
    	
    	
    	
    }
    
    
    
    @RequestMapping(value = "/saveForm", method = RequestMethod.POST,consumes = "application/json", produces = "application/json")
    @ResponseBody
    public ResponseEntity<LoginInfo>  saveFeedbackForm(@RequestBody VolunteerAssignment volunteerassignement)
    {
    	
    	LoginInfo loginInfo = new LoginInfo();
    	Integer idgreviance;
    	idgreviance =	medicalandgreivanceservice.processformData(volunteerassignement);
    	loginInfo.setMessage("Success"); 
		loginInfo.setStatusCode("0");
		loginInfo.setIdgrevance(idgreviance);
		 return new ResponseEntity<LoginInfo>(loginInfo, HttpStatus.OK);
   
}
    
    @RequestMapping(value = "/registerNewSrCitizen", method = RequestMethod.POST,consumes = "application/json", produces = "application/json")
    @ResponseBody
    public ResponseEntity<LoginInfo>  registerNewSrCitizen(@RequestBody VolunteerAssignment volunteerassignement)
    {
    	
    	LoginInfo loginInfo = new LoginInfo();
    	volunteerassignmentRespository.save(volunteerassignement);
    	loginInfo.setMessage("Success"); 
		loginInfo.setStatusCode("0");
		 return new ResponseEntity<LoginInfo>(loginInfo, HttpStatus.OK);
   
}
    
    

    
    
    


}