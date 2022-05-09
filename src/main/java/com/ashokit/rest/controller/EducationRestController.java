package com.ashokit.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ashokit.binding.EducationDetails;
import com.ashokit.service.PlanService;

@RestController
public class EducationRestController {
	
	@Autowired
	private PlanService service;
	
	@PostMapping("/education")
	public ResponseEntity<String> getEducationDetails(@RequestBody EducationDetails educationDetails) {
		String educationData = service.saveEducationDetails(educationDetails);
		return new ResponseEntity<String>(educationData, HttpStatus.OK);
		
	}

}
