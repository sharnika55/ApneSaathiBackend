package com.kef.org.rest.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;


@Entity
@Table(name = "greivance_tracking")
@NamedQueries({
@NamedQuery(name = "GreivanceTracking.findAllbyidvolunteer",
query = "SELECT g FROM GreivanceTracking g WHERE g.idvolunteer =:idvolunteer"
)
}) 
public class GreivanceTracking {
	
	
	  @Id
	  @GeneratedValue(strategy=GenerationType.IDENTITY) 
	  @Column(name = "TRACKINGID",nullable =false)
	  private Integer trackingId;
	  
	  @Column(name = "CALL_ID",nullable =false)
	  private Integer callid;
	  
	  @Column(name = "IDVOLUNTEER",nullable =false)
	  private Integer idvolunteer;
	  
	  @Column(name = "IDGREIVANCE",nullable =false)
	  private Integer idgrevance;
	  
	  @Column(name = "name_srcitizen",nullable =false)
	  private String namesrcitizen;
	  
	  @Column(name = "gender_srcitizen",nullable =false)
	  private String gendersrcitizen;

	  @Column(name = "type_of_greivance")
	  private String greivanceType;
	  
	  @Column(name = "status")
	  private String status;
	  
	  @Column(name = "description", columnDefinition ="varchar(255) default ''")
	  private String description;
	  
	  @Column(name = "createddate", columnDefinition ="TIMESTAMP DEFAULT CURRENT_TIMESTAMP" , nullable =false)
	  private LocalDateTime createdDate;
	  
	  @Column(name = "priority",columnDefinition ="varchar(255) default 'Low'")
	  private String priority;
	  
	  @Column(name = "lastupdatedon", columnDefinition ="TIMESTAMP DEFAULT NULL")
	  private LocalDateTime lastUpdatedOn;
	  

	

	public String getPriority() {
		return priority;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public LocalDateTime getLastUpdatedOn() {
		return lastUpdatedOn;
	}

	public void setLastUpdatedOn(LocalDateTime lastUpdatedOn) {
		this.lastUpdatedOn = lastUpdatedOn;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getTrackingId() {
		return trackingId;
	}

	public void setTrackingId(Integer trackingId) {
		this.trackingId = trackingId;
	}

	public Integer getCallid() {
		return callid;
	}

	public void setCallid(Integer callid) {
		this.callid = callid;
	}

	public Integer getIdvolunteer() {
		return idvolunteer;
	}

	public void setIdvolunteer(Integer idvolunteer) {
		this.idvolunteer = idvolunteer;
	}


	public String getNamesrcitizen() {
		return namesrcitizen;
	}

	public void setNamesrcitizen(String namesrcitizen) {
		this.namesrcitizen = namesrcitizen;
	}

	public String getGendersrcitizen() {
		return gendersrcitizen;
	}

	public void setGendersrcitizen(String gendersrcitizen) {
		this.gendersrcitizen = gendersrcitizen;
	}

	public String getGreivanceType() {
		return greivanceType;
	}

	public void setGreivanceType(String greivanceType) {
		this.greivanceType = greivanceType;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getIdgrevance() {
		return idgrevance;
	}

	public void setIdgrevance(Integer idgrevance) {
		this.idgrevance = idgrevance;
	}
	  
	  
}
