package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "aadhar")
public class AadharEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer aadharId;
	Integer aadharNum;

 	@OneToOne
 	@JoinColumn(name = "citizenId")     
	CitizenEntity citizen;
	
	
	public Integer getAadharId() {
		return aadharId;
	}

	public void setAadharId(Integer aadharId) {
		this.aadharId = aadharId;
	}

	public Integer getAadharNum() {
		return aadharNum;
	}

	public void setAadharNum(Integer aadharNum) {
		this.aadharNum = aadharNum;
	}

	public CitizenEntity getCitizen() {
		return citizen;
	}

	public void setCitizen(CitizenEntity citizen) {
		this.citizen = citizen;
	}
	

}
