package com.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/myfirstapp")
public class FirstRestApi {
	@GetMapping
	public ResponseEntity<Object> greet() {
		System.out.println("*********** This is First MS **********");
		return ResponseEntity.status(HttpStatus.OK).body("Hello First MS");
	}
}
