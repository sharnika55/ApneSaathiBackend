package com.kef.org.rest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "srcitizen_greivance_log")
public class MedicalandGreivance {
	
	  @Id
	  @GeneratedValue(strategy=GenerationType.AUTO) 
	  @Column(name = "IDGREIVANCE",nullable =false)
	  private Integer idgrevance;
	  
	  
	  @Column(name = "CALL_ID",nullable =false)
	  private Integer callid;
	  
	  @Column(name = "IDVOLUNTEER",nullable =false)
	  private Integer idvolunteer;
	  
	  @Column(name = "is_diabetic")
	  private char diabetic;
	  
	  @Column(name = "is_bloddpressure")
	  private char bloodpressure;
	  
	  @Column(name = "is_lungailment")
	  private char lungailment;
	  
	  @Column(name = "is_cancer_or_major_surgery")
	  private char cancer_or_majorsurgery;
	  
	  @Column(name = "is_other_ailments")
	  private char other_ailments;
	  
	  @Column(name = "remarks_medical_history")
	  private String remarks_medical_history;
	  
	  @Column(name = "related_info_talked_about")
	  private char related_info_talked_about;
	  
	  @Column(name = "behavioural_change_noticed")
	  private char behavioural_change_noticed;
	  
	  
	  
	  @Column(name = "is_covid_symptoms")
	  private char iscovidsymptoms;
	  
	  
	  @Column(name = "has_cough")
	  private char hascough;
	  
	  @Column(name = "has_fever")
	  private char hasfever;
	  
	  @Column(name = "has_shortnessofbreath")
	  private char has_shortnes_of_breath;

	  @Column(name = "has_sore_throat")
	  private char has_sorethroat;
	  
	  //4.Not quarantine,1. Home Quarantine, 2. Govt Quarantine, 3. Hospitalized
	  @Column(name = "quarantine_status")
	  private Integer quarantinestatus;

	  
	  //1. Raised 2. Under Review 3. Resolved
	  @Column(name = "is_foodshortage")
	  private Integer foodshortage;
	  
	  @Column(name = "is_medicine_shortage")
	  private Integer medicineshortage;
	  
	  @Column(name = "is_access_to_bank")
	  private Integer aceesstobankingissue;
	  
	  @Column(name = "is_utility_supply_issue")
	  private Integer utilitysupplyissue;
	  
	  @Column(name = "is_hygene_santiation_issue")
	  private Integer hygieneissue;
	  
	  @Column(name = "is_safety_issue")
	  private Integer safetyissue;
	  
	  @Column(name = "is_emergency_service_issue")
	  private Integer emergencyserviceissue;
	  
	  @Column(name = "is_phone_internet_issue")
	  private Integer phoneandinternetissue;
	  
	  @Column(name = "emerygency_flag")
	  private char isemergencyservicerequired;
	  
	  @Column(name = "remarks_important_info")
	  private String remakrsimportantinfo;
	  
	  @Column(name = "loggeddatetime")
	  private LocalDateTime loggeddattime;
	  
	  
	  
	  
	  
	
	  public Integer getIdgrevance() {
		return idgrevance;
	}

	public void setIdgrevance(Integer idgrevance) {
		this.idgrevance = idgrevance;
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


	public char getDiabetic() {
		return diabetic;
	}

	public void setDiabetic(char diabetic) {
		this.diabetic = diabetic;
	}

	public char getBloodpressure() {
		return bloodpressure;
	}

	public void setBloodpressure(char bloodpressure) {
		this.bloodpressure = bloodpressure;
	}

	public char getLungailment() {
		return lungailment;
	}

	public void setLungailment(char lungailment) {
		this.lungailment = lungailment;
	}

	public char getCancer_or_majorsurgery() {
		return cancer_or_majorsurgery;
	}

	public void setCancer_or_majorsurgery(char cancer_or_majorsurgery) {
		this.cancer_or_majorsurgery = cancer_or_majorsurgery;
	}

	public char getOther_ailments() {
		return other_ailments;
	}

	public void setOther_ailments(char other_ailments) {
		this.other_ailments = other_ailments;
	}

	public String getRemarks_medical_history() {
		return remarks_medical_history;
	}

	public void setRemarks_medical_history(String remarks_medical_history) {
		this.remarks_medical_history = remarks_medical_history;
	}

	public char getRelated_info_talked_about() {
		return related_info_talked_about;
	}

	public void setRelated_info_talked_about(char related_info_talked_about) {
		this.related_info_talked_about = related_info_talked_about;
	}

	public char getBehavioural_change_noticed() {
		return behavioural_change_noticed;
	}

	public void setBehavioural_change_noticed(char behavioural_change_noticed) {
		this.behavioural_change_noticed = behavioural_change_noticed;
	}

	public char getIscovidsymptoms() {
		return iscovidsymptoms;
	}

	public void setIscovidsymptoms(char iscovidsymptoms) {
		this.iscovidsymptoms = iscovidsymptoms;
	}

	public char getHascough() {
		return hascough;
	}

	public void setHascough(char hascough) {
		this.hascough = hascough;
	}

	public char getHasfever() {
		return hasfever;
	}

	public void setHasfever(char hasfever) {
		this.hasfever = hasfever;
	}

	public char getHas_shortnes_of_breath() {
		return has_shortnes_of_breath;
	}

	public void setHas_shortnes_of_breath(char has_shortnes_of_breath) {
		this.has_shortnes_of_breath = has_shortnes_of_breath;
	}

	public char getHas_sorethroat() {
		return has_sorethroat;
	}

	public void setHas_sorethroat(char has_sorethroat) {
		this.has_sorethroat = has_sorethroat;
	}

	public Integer getQuarantinestatus() {
		return quarantinestatus;
	}

	public void setQuarantinestatus(Integer quarantinestatus) {
		this.quarantinestatus = quarantinestatus;
	}

	public Integer getFoodshortage() {
		return foodshortage;
	}

	public void setFoodshortage(Integer foodshortage) {
		this.foodshortage = foodshortage;
	}

	public Integer getMedicineshortage() {
		return medicineshortage;
	}

	public void setMedicineshortage(Integer medicineshortage) {
		this.medicineshortage = medicineshortage;
	}

	public Integer getAceesstobankingissue() {
		return aceesstobankingissue;
	}

	public void setAceesstobankingissue(Integer aceesstobankingissue) {
		this.aceesstobankingissue = aceesstobankingissue;
	}

	public Integer getUtilitysupplyissue() {
		return utilitysupplyissue;
	}

	public void setUtilitysupplyissue(Integer utilitysupplyissue) {
		this.utilitysupplyissue = utilitysupplyissue;
	}

	public Integer getHygieneissue() {
		return hygieneissue;
	}

	public void setHygieneissue(Integer hygieneissue) {
		this.hygieneissue = hygieneissue;
	}

	public Integer getSafetyissue() {
		return safetyissue;
	}

	public void setSafetyissue(Integer safetyissue) {
		this.safetyissue = safetyissue;
	}

	public Integer getEmergencyserviceissue() {
		return emergencyserviceissue;
	}

	public void setEmergencyserviceissue(Integer emergencyserviceissue) {
		this.emergencyserviceissue = emergencyserviceissue;
	}

	public Integer getPhoneandinternetissue() {
		return phoneandinternetissue;
	}

	public void setPhoneandinternetissue(Integer phoneandinternetissue) {
		this.phoneandinternetissue = phoneandinternetissue;
	}

	public char getIsemergencyservicerequired() {
		return isemergencyservicerequired;
	}

	public void setIsemergencyservicerequired(char isemergencyservicerequired) {
		this.isemergencyservicerequired = isemergencyservicerequired;
	}

	public String getRemakrsimportantinfo() {
		return remakrsimportantinfo;
	}

	public void setRemakrsimportantinfo(String remakrsimportantinfo) {
		this.remakrsimportantinfo = remakrsimportantinfo;
	}

	public LocalDateTime getLoggeddattime() {
		return loggeddattime;
	}

	public void setLoggeddattime(LocalDateTime loggeddattime) {
		this.loggeddattime = loggeddattime;
	}

	
	  
	  
	  
	  
	  
 

}
