package com.example;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("FIRST-APP")
public interface FirstMicroserviceClient {

	// sends request as GET http://FIRST-APP/myfirstapp
	@GetMapping(path = "/myfirstapp")
	public String callGreetOfFirstMS();
	
}
