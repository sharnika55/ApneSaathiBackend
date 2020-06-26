package com.kef.org.rest.repository;

import com.kef.org.rest.model.Volunteer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface VolunteerRepository extends JpaRepository<Volunteer, Integer> {

	
	    Integer fetchByphoneNumber(String phoneNo);
	    
	    Volunteer fetchVolunteerDetails(String phoneNo);

}

