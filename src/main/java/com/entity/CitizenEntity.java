package com.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "citizen")
public class CitizenEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer citizenId;
	String name;


	@OneToMany
	@JoinColumn(name = "citizenId")
	List<LoanEntity> loans; 
	
	public Integer getCitizenId() {
		return citizenId;
	}

	public void setCitizenId(Integer citizenId) {
		this.citizenId = citizenId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<LoanEntity> getLoans() {
		return loans;
	}

	public void setLoans(List<LoanEntity> loans) {
		this.loans = loans;
	}
	

}
