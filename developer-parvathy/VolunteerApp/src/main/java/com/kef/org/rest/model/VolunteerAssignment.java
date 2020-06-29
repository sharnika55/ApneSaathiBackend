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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "volunteer_assignment")	
public class VolunteerAssignment {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 
	@Column(name = "CALL_ID",nullable =false)
    private Integer callid;

	@Column(name = "idvolunteer",nullable =false)
	private Integer idvolunteer;	
	
	public Integer getIdvolunteer() {
		return idvolunteer;
	}

	public void setIdvolunteer(Integer idvolunteer) {
		this.idvolunteer = idvolunteer;
	}

	@Column(name = "name_srcitizen",nullable =false)
	private String namesrcitizen;
	
	@Column(name = "phoneno_srcitizen",nullable =false)
	private String phonenosrcitizen;
	
	@Column(name = "age_srcitizen")
	private Integer agesrcitizen;
	
	@Column(name = "gender_srcitizen")
	private char gendersrcitizen;
	
	@Column(name = "address_srcitizen")
	private String addresssrcitizen;
	
	@Column(name = "email_srcitizen")
	private String emailsrcitizen;
	
	@Column(name = "state_srcitizen")
	private String statesrcitizen;
	
	@Column(name = "district_srcitizen")
	private String districtsrcitizen;
	
	@Column(name = "blockname_srcitizen")
	private String blocknamesrcitizen;
	
	@Column(name = "village_srcitizen")
	private String villagesrcitizen;
	
	@Column(name = "call_status_code")
	private Integer callstatusCode;
	
	@Column(name = "call_status_subcode")
	private Integer callstatussubCode;
	
	@Column(name = "talked_with")
	private char talkedwith;
	
	public char getTalkedwith() {
		return talkedwith;
	}

	public void setTalkedwith(char talkedwith) {
		this.talkedwith = talkedwith;
	}

	public List<MedicalandGreivance> getMedicalandgreivance() {
		return medicalandgreivance;
	}

	public void setMedicalandgreivance(List<MedicalandGreivance> medicalandgreivance) {
		this.medicalandgreivance = medicalandgreivance;
	}

	@Column(name = "assigned_by_member")
	private String assignedbyMember;
	
	@Column(name = "remarks_after_call")
	private String remarks;
	
	@Column(name = "loggeddatetime")
	private LocalDateTime loggeddateTime;
	
	
	 @OneToMany(cascade = CascadeType.ALL)
	 @JoinColumn(name = "CALL_ID")
	 private List <MedicalandGreivance> medicalandgreivance;
	 

	public Integer getCallid() {
		return callid;
	}

	public void setCallid(Integer callid) {
		this.callid = callid;
	}

	public String getNamesrcitizen() {
		return namesrcitizen;
	}

	public void setNamesrcitizen(String namesrcitizen) {
		this.namesrcitizen = namesrcitizen;
	}

	public String getPhonenosrcitizen() {
		return phonenosrcitizen;
	}

	public void setPhonenosrcitizen(String phonenosrcitizen) {
		this.phonenosrcitizen = phonenosrcitizen;
	}

	public Integer getAgesrcitizen() {
		return agesrcitizen;
	}

	public void setAgesrcitizen(Integer agesrcitizen) {
		this.agesrcitizen = agesrcitizen;
	}

	public char getGendersrcitizen() {
		return gendersrcitizen;
	}

	public void setGendersrcitizen(char gendersrcitizen) {
		this.gendersrcitizen = gendersrcitizen;
	}

	public String getAddresssrcitizen() {
		return addresssrcitizen;
	}

	public void setAddresssrcitizen(String addresssrcitizen) {
		this.addresssrcitizen = addresssrcitizen;
	}

	public String getEmailsrcitizen() {
		return emailsrcitizen;
	}

	public void setEmailsrcitizen(String emailsrcitizen) {
		this.emailsrcitizen = emailsrcitizen;
	}

	public String getStatesrcitizen() {
		return statesrcitizen;
	}

	public void setStatesrcitizen(String statesrcitizen) {
		this.statesrcitizen = statesrcitizen;
	}

	public String getDistrictsrcitizen() {
		return districtsrcitizen;
	}

	public void setDistrictsrcitizen(String districtsrcitizen) {
		this.districtsrcitizen = districtsrcitizen;
	}

	public String getBlocknamesrcitizen() {
		return blocknamesrcitizen;
	}

	public void setBlocknamesrcitizen(String blocknamesrcitizen) {
		this.blocknamesrcitizen = blocknamesrcitizen;
	}

	public String getVillagesrcitizen() {
		return villagesrcitizen;
	}

	public void setVillagesrcitizen(String villagesrcitizen) {
		this.villagesrcitizen = villagesrcitizen;
	}

	public Integer getCallstatusCode() {
		return callstatusCode;
	}

	public void setCallstatusCode(Integer callstatusCode) {
		this.callstatusCode = callstatusCode;
	}

	public Integer getCallstatussubCode() {
		return callstatussubCode;
	}

	public void setCallstatussubCode(Integer callstatussubCode) {
		this.callstatussubCode = callstatussubCode;
	}

	public String getAssignedbyMember() {
		return assignedbyMember;
	}

	public void setAssignedbyMember(String assignedbyMember) {
		this.assignedbyMember = assignedbyMember;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public LocalDateTime getLoggeddateTime() {
		return loggeddateTime;
	}

	public void setLoggeddateTime(LocalDateTime loggeddateTime) {
		this.loggeddateTime = loggeddateTime;
	}


	

	
	
	


}
