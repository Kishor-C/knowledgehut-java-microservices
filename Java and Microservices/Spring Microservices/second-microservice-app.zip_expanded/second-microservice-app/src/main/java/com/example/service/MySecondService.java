package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MySecondService {

	@Autowired
	private RestTemplate rest;
	
	public String callsFirstService() {
		String url = "http://FIRST-APP/myfirstapp";
		String result = rest.getForObject(url, String.class);
		return result;
	}
}
