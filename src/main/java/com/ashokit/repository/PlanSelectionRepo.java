package com.ashokit.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.binding.IncomeDetails;
import com.ashokit.entity.DCIncomeEntity;
import com.ashokit.entity.DCPlanEntity;

public interface PlanSelectionRepo extends JpaRepository<DCPlanEntity, Serializable> {

	

}
