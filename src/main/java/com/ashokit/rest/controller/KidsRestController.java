package com.ashokit.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ashokit.binding.KidsDetails;
import com.ashokit.service.PlanService;

@RestController
public class KidsRestController {
	
	@Autowired
	private PlanService service;
	
	@PostMapping("/childs")
	public ResponseEntity<String> getEducationDetails(@RequestBody List<KidsDetails> kidsDetails) {
		String kidsData = service.saveKidsDetails(kidsDetails);
		return new ResponseEntity<String>(kidsData, HttpStatus.OK);
	}
}
