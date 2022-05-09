package com.ashokit.service;

import java.util.List;

import com.ashokit.binding.EducationDetails;
import com.ashokit.binding.IncomeDetails;
import com.ashokit.binding.KidsDetails;
import com.ashokit.binding.PlanSelection;

public interface PlanService {
	
	public String savePlanSelection(PlanSelection planSelection);
	
	public String saveIncomeDetails(IncomeDetails incomeDetails);
	
	public String saveEducationDetails(EducationDetails educationDetails);
	
	public String saveKidsDetails(List<KidsDetails> kidsDetails);
	

}
