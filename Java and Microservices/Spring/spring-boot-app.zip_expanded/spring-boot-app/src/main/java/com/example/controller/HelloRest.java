package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // this creates an object in container to handle webservice calls
@RequestMapping("api") // this handles the url
public class HelloRest {

	@GetMapping(path = "/testing") // HTTP GET http://ip:port/api/testing
	public String greet() {
		return "Welcome to REST API";
	}
}
