package com.ashokit.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ashokit.binding.PlanSelection;
import com.ashokit.service.PlanService;

@RestController
public class PlanRestController {
	
	@Autowired
	private PlanService service;
	
	@PostMapping("/plan")
	public ResponseEntity<String> getPlanselection(@RequestBody PlanSelection planSelection) {
		String planData = service.savePlanSelection(planSelection);
		return new ResponseEntity<String>(planData, HttpStatus.OK);
		
	}

}
