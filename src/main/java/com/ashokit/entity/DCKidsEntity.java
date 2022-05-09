package com.ashokit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="DC_CHILDS")
public class DCKidsEntity {
	
	@Id
	@GeneratedValue
	@Column(name="CITIZEN_ID")
	private Integer citizenId;
	
	@Column(name="CASE_NUMBER")
	private Integer caseNumber;
	
	@Column(name="CHILD_NAME")
	private String childName;
	
	@Column(name="CHILD_SSN")
	private Integer childSsn;
	
	@Column(name="CHILD_AGE")
	private Integer childAge;

}
