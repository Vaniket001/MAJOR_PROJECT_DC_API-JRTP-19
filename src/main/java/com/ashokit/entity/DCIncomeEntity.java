package com.ashokit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="DC_INCOME")
public class DCIncomeEntity {
	

	@Id
	@GeneratedValue
	@Column(name="CITIZEN_ID")
	private Integer citizenId;
	
	@Column(name="CASE_NUMBER")
	private Integer caseNumber;
	
	@Column(name="SALARY_INCOME")
	private Double salaryIncome;
	
	@Column(name="PROPERTY_INCOME")
	private Double propertyIncome;
	
	@Column(name="RENT_INCOME")
	private Double rentIncome;
}
