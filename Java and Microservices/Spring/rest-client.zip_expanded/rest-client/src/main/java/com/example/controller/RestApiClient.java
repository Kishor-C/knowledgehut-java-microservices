package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("api2")
public class RestApiClient {

	@Autowired
	private RestTemplate template;

	@GetMapping
	public ResponseEntity<Object> callAnotherWs() {
		String result = template.getForObject("http://localhost:8081/my-app/api", String.class);
		return ResponseEntity.status(HttpStatus.OK).body("api2 got "+result);
	}
}
