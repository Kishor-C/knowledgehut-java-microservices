package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
public class MyThirdService {

	// autowiring the @FeignClient interface implementation
	@Autowired
	private FirstMicroserviceClient client;
	
	@CircuitBreaker(name = "fetchFirstApp", fallbackMethod = "alternateMethodForFirstApp")
	public String invokeRemoteMicroService() {
		System.out.println("***** request is sent to orignal microservice ****");
		// the below call sends request to http://FIRST-MS/myfirstapp
		String result = client.callGreetOfFirstMS();
		return result;
	}
	
	public String alternateMethodForFirstApp(Throwable t) {
		System.err.println("**** Fallback method is executed *****");
		return "Fallback Service is executed!";
	}
}
