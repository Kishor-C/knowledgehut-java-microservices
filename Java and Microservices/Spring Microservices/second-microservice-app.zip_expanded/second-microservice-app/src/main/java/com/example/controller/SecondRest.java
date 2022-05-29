package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.MySecondService;

@RestController
@RequestMapping("mysecondapp")
public class SecondRest {

	// here MySecondService interface must have used as reference
	@Autowired
	private MySecondService service;
	
	@GetMapping("/test")
	public ResponseEntity<Object> callGreet() {
		String result = service.callsFirstService();
		result = "This is Second MS and "+result;
		return ResponseEntity.status(HttpStatus.OK).body(result);
	}
}
