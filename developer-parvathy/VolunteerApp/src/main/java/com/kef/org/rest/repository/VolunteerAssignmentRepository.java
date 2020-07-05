package com.kef.org.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kef.org.rest.model.VolunteerAssignment;

@Repository
public interface VolunteerAssignmentRepository  extends JpaRepository<VolunteerAssignment, Integer>{

}
