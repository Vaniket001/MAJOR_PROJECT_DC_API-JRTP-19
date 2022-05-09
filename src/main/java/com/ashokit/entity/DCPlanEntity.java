package com.ashokit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="DC_Plan")
public class DCPlanEntity {
	
	@Id
	@GeneratedValue
	@Column(name="CITIZEN_ID")
	private Integer citizenId;
	
	@Column(name="CASE_NUMBER")
	private Integer caseNumber;
	
	@Column(name="PLAN_NAME")
	private String planName;

}
