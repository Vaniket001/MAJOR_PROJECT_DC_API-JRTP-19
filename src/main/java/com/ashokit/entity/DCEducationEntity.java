package com.ashokit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="DC_EDUCATION")
public class DCEducationEntity {	
	
	@Id
	@GeneratedValue
	@Column(name="CITIZEN_ID")
	private Integer citizenId;
	
	@Column(name="CASE_NUMBER")
	private Integer caseNumber;
	
	@Column(name="GRADUATION_STATUS")
	private String graduationStatus;
	
	@Column(name="GRADUATION_YEAR")
	private String graduationYear;
	
	@Column(name="UNIVERSITY")
	private String university;
	
	@Column(name="HIGHEST_DEGREE")
	private String highestDegree;
	
	
	

}
