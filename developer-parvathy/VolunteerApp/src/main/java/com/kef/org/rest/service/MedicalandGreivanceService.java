package com.kef.org.rest.service;

import java.util.Iterator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kef.org.rest.model.VolunteerAssignment;
import com.kef.org.rest.controller.VolunteerController;
import com.kef.org.rest.model.MedicalandGreivance;
import com.kef.org.rest.repository.MedicalandGreivanceRepository;
import com.kef.org.rest.repository.VolunteerAssignmentRepository;
import com.kef.org.rest.repository.VolunteerRepository;

@Service("medicalandgreivanceservice")
public class MedicalandGreivanceService {
	
	@Autowired
	private MedicalandGreivanceRepository medicalandgreivancerespository;
	
	@Autowired
	private VolunteerAssignmentRepository volunteerassignmentrespository;
	
	
	
	private MedicalandGreivance medicalandgreivance;
	
	
	public static final Logger logger = LoggerFactory.getLogger(MedicalandGreivanceService.class);
	
	public void processformData(VolunteerAssignment volunteerassignement)
	{
		
		Integer callstatuscode;
		Integer callstatussubcode;
		char talkedwith;
		
		
		callstatuscode = volunteerassignement.getCallstatusCode();
		callstatussubcode = volunteerassignement.getCallstatussubCode();
		talkedwith = volunteerassignement.getTalkedwith();
		
	
		
		
	//	volunteerassignmentrespository.save(volunteerassignement);
		
		if(callstatuscode.equals(2) && callstatussubcode.equals(5))
		{
			VolunteerAssignment va1 = volunteerassignmentrespository.findById(volunteerassignement.getCallid()).get(); 
			va1.setCallstatusCode(volunteerassignement.getCallstatusCode());
			va1.setCallstatussubCode(volunteerassignement.getCallstatussubCode());
			
			
			
			logger.info("Reached here11111"); 
			if(talkedwith == 'C') 
			{
				
				volunteerassignmentrespository.save(va1);
				
			//	va1.setMedicalandgreivance(volunteerassignement.getMedicalandgreivance());
				
				
				
				
				  logger.info("Reached here22222222"); Iterator<MedicalandGreivance>
				  medicalandgreivanceIterator =
				  volunteerassignement.getMedicalandgreivance().iterator();
				  
				  while(medicalandgreivanceIterator.hasNext()) { medicalandgreivance =
				  medicalandgreivanceIterator.next();
				  
				  medicalandgreivancerespository.save(medicalandgreivance);
				  
				  }
				 
			}else {
				logger.info("Reached here33333333333333333333"); 
				va1.setTalkedwith(volunteerassignement.getTalkedwith());
				
				volunteerassignmentrespository.save(va1);
				
				Iterator<MedicalandGreivance>
				  medicalandgreivanceIterator =
				  volunteerassignement.getMedicalandgreivance().iterator();
				  
				  while(medicalandgreivanceIterator.hasNext()) { medicalandgreivance =
				  medicalandgreivanceIterator.next();
				  
				  medicalandgreivancerespository.save(medicalandgreivance);
				  
				  }
				
				 
				
			}
			}else {
				logger.info("Reached here4444444444444444444444"); 
				VolunteerAssignment va1 = volunteerassignmentrespository.findById(volunteerassignement.getCallid()).get(); 
				va1.setCallstatusCode(volunteerassignement.getCallstatusCode());
				va1.setCallstatussubCode(volunteerassignement.getCallstatussubCode());
				
				volunteerassignmentrespository.save(va1);
				
			}
		
		}
		
	}
		
	

	
	


