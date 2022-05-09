package com.ashokit.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ashokit.binding.IncomeDetails;
import com.ashokit.service.PlanService;

@RestController
public class IncomeRestController {
	
	@Autowired
	private PlanService service;
	
	@PostMapping("/income")
	public ResponseEntity<String> getIncomeDetails(@RequestBody IncomeDetails incomeDetails) {
		String incomeData = service.saveIncomeDetails(incomeDetails);
		return new ResponseEntity<String>(incomeData, HttpStatus.OK);
		
	}

}
