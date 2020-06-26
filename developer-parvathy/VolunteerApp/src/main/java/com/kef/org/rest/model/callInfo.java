package com.kef.org.rest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.FetchType;
import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
@Table(name = "volunteer_srcitizen_callstatus")	
public class callInfo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 
	@Column(name = "CALLID")
	private Integer callId;
	
	@Column(name = "IDVOLUNTEER")
	private Integer volunteerId;
	
	@Column(name = "IDSRCITIZEN")
	private Integer seniorCitizenId; 
	
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "FIRSTNAME")
    private SeniorCitizen seniorcitizenName;
 

	@Column(name = "CALLSTATUS")
	private String status_code;
	
	@Column(name = "REMARK")
	private String remarks;
	

}
