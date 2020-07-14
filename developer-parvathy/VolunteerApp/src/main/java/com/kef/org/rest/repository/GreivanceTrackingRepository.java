package com.kef.org.rest.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.kef.org.rest.model.GreivanceTracking;

@Repository
public interface GreivanceTrackingRepository extends JpaRepository<GreivanceTracking, Integer>{
	
	List<GreivanceTracking> findAllbyidvolunteer(Integer idvolunteer);

}
