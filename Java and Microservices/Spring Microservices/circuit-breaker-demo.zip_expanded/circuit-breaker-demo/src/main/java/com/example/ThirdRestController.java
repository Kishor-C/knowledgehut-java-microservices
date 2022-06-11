package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mythirdapp")
public class ThirdRestController {

	@Autowired
	MyThirdService service;
	
	@GetMapping
	public ResponseEntity<Object> testRemoteCalls() {
		String result = service.invokeRemoteMicroService();
		return ResponseEntity.status(200).body("Third Microservice called: "+result);
	}
}
