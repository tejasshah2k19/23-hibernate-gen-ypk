package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class EmployeeEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer employeeId;

	String name;
	String city;

	@ManyToOne
	@JoinColumn(name = "jobTypeId")
	JobTypeEntity jobType;

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public JobTypeEntity getJobType() {
		return jobType;
	}

	public void setJobType(JobTypeEntity jobType) {
		this.jobType = jobType;
	}
	

}

//E to J -> 1 to  1 
//J to E -> M to  1 

//PartTime FullTime 

//Employee 