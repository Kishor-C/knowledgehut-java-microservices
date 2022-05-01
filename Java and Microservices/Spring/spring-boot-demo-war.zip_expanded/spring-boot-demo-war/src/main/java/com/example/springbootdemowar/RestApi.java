package com.example.springbootdemowar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("simple-rest")
public class RestApi {

	@GetMapping
	public String hello() {
		return "Hello External Server";
	}
}
