package com.ashokit.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.binding.EducationDetails;
import com.ashokit.binding.IncomeDetails;
import com.ashokit.binding.KidsDetails;
import com.ashokit.binding.PlanSelection;
import com.ashokit.entity.DCEducationEntity;
import com.ashokit.entity.DCIncomeEntity;
import com.ashokit.entity.DCKidsEntity;
import com.ashokit.entity.DCPlanEntity;
import com.ashokit.repository.EducationDetailsRepo;
import com.ashokit.repository.IncomeDetailsRepo;
import com.ashokit.repository.KidsDetailsRepo;
import com.ashokit.repository.PlanSelectionRepo;

@Service
public class PlanServiceImpl implements PlanService {

	@Autowired
	private PlanSelectionRepo planRepo;

	@Autowired
	private IncomeDetailsRepo incomeRepo;

	@Autowired
	private EducationDetailsRepo educationRepo;

	@Autowired
	private KidsDetailsRepo kidsRepo;

	@Override
	public String savePlanSelection(PlanSelection planSelection) {

		DCPlanEntity entity = new DCPlanEntity();
		BeanUtils.copyProperties(planSelection, entity);
		planRepo.save(entity);

		return "Plan Selection Data Saved Successfully";
	}

	@Override
	public String saveIncomeDetails(IncomeDetails incomeDetails) {

		DCIncomeEntity entity = new DCIncomeEntity();
		BeanUtils.copyProperties(incomeDetails, entity);
		incomeRepo.save(entity);

		return "Income Details Data Saved Successfully";
	}

	@Override
	public String saveEducationDetails(EducationDetails educationDetails) {

		DCEducationEntity entity = new DCEducationEntity();
		BeanUtils.copyProperties(educationDetails, entity);
		educationRepo.save(entity);
		return "Education Details Data Saved Successfully";
	}

	@Override
	public String saveKidsDetails(List<KidsDetails> kidsDetailsList) {

		
		for (KidsDetails kidsDetails : kidsDetailsList) {
			DCKidsEntity entity= new DCKidsEntity();
			BeanUtils.copyProperties(kidsDetails, entity);
			kidsRepo.save(entity);

		}
		return "Kids Details Data Saved Successfully";
	}

}
