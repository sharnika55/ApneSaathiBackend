package com.kef.org.rest.service;

import java.util.Iterator;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
	
	Integer idgreivance;
	
	
	public static final Logger logger = LoggerFactory.getLogger(MedicalandGreivanceService.class);
	  
	@Transactional
	public Integer processformData(VolunteerAssignment volunteerassignement)
	{
		
		Integer callstatuscode;
		Integer callstatussubcode;
	
		
		String talkedwith;
		
		
		callstatuscode = volunteerassignement.getCallstatusCode();
		callstatussubcode = volunteerassignement.getCallstatussubCode();
		talkedwith = volunteerassignement.getTalkedwith();
		
	
		
		
	//	volunteerassignmentrespository.save(volunteerassignement);
		
		if(callstatuscode.equals(2) && callstatussubcode.equals(5))
		{   
			
			
			VolunteerAssignment va1 = volunteerassignmentrespository.findById(volunteerassignement.getCallid()).get(); 
			va1.setCallstatusCode(volunteerassignement.getCallstatusCode());
			va1.setCallstatussubCode(volunteerassignement.getCallstatussubCode());
			va1.setTalkedwith(volunteerassignement.getTalkedwith());
			
			
			volunteerassignmentrespository.save(va1);
			
			 Iterator<MedicalandGreivance> medicalandgreivanceIterator =
					  volunteerassignement.getMedicalandgreivance().iterator();
					  
					  while(medicalandgreivanceIterator.hasNext()) { 
						  Integer idgreivancelocal;
					  medicalandgreivance =  medicalandgreivanceIterator.next();
					  
					  idgreivance =	  medicalandgreivancerespository.save(medicalandgreivance).getIdgrevance();
					 
					 
					  }
					 
					
					  return 	idgreivance;

						/*
						 * if(talkedwith.equals("Senior Citizen")) {
						 * 
						 * //va1.setMedicalandgreivance(volunteerassignement.getMedicalandgreivance());
						 * volunteerassignmentrespository.save(va1);
						 * 
						 * Iterator<MedicalandGreivance> medicalandgreivanceIterator =
						 * volunteerassignement.getMedicalandgreivance().iterator();
						 * 
						 * while(medicalandgreivanceIterator.hasNext()) { Integer idgreivancelocal;
						 * medicalandgreivance = medicalandgreivanceIterator.next();
						 * 
						 * idgreivance =
						 * medicalandgreivancerespository.save(medicalandgreivance).getIdgrevance();
						 * 
						 * 
						 * }
						 * 
						 * 
						 * return idgreivance;
						 * 
						 * }else {
						 * 
						 * 
						 * 
						 * // va1.setNamesrcitizen(volunteerassignement.getNamesrcitizen()); //
						 * va1.setAgesrcitizen(volunteerassignement.getAgesrcitizen()); //
						 * va1.setGendersrcitizen(volunteerassignement.getGendersrcitizen()); //
						 * va1.setPhonenosrcitizen(volunteerassignement.getPhonenosrcitizen());
						 * //.setAddresssrcitizen(volunteerassignement.getAddresssrcitizen());
						 * 
						 * //va1.setMedicalandgreivance(volunteerassignement.getMedicalandgreivance());
						 * volunteerassignmentrespository.save(va1);
						 * 
						 * 
						 * Iterator<MedicalandGreivance> medicalandgreivanceIterator =
						 * volunteerassignement.getMedicalandgreivance().iterator();
						 * 
						 * while(medicalandgreivanceIterator.hasNext()) { Integer idgreivancelocal;
						 * medicalandgreivance = medicalandgreivanceIterator.next();
						 * 
						 * idgreivance =
						 * medicalandgreivancerespository.save(medicalandgreivance).getIdgrevance();
						 * 
						 * 
						 * } return idgreivance;
						 * 
						 * 
						 * }
						 */
			}else {

				VolunteerAssignment va1 = volunteerassignmentrespository.findById(volunteerassignement.getCallid()).get(); 
				va1.setCallstatusCode(volunteerassignement.getCallstatusCode());
				va1.setCallstatussubCode(volunteerassignement.getCallstatussubCode());
				
				volunteerassignmentrespository.save(va1);
			
				return -1;
				
				  
				  }
				
				
				
			}
		
		}
		

	
	


