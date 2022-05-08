package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.TestDao2;

@RestController // this creates an object in container to handle webservice calls
@RequestMapping("api") // this handles the url
public class HelloRest {

	@Autowired
	private TestDao2 dao2;
	
	@GetMapping(path = "/testing") // HTTP GET http://ip:port/api/testing
	public String greet() {
		return "Welcome to REST API";
	}

	@GetMapping
	public ResponseEntity<Object> testingDao2() {
		return ResponseEntity.status(HttpStatus.OK).body(dao2.test2());
	}
}
