package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyThirdService {

	// autowiring the @FeignClient interface implementation
	@Autowired
	private FirstMicroserviceClient client;
	
	public String invokeRemoteMicroService() {
		// the below call sends request to http://FIRST-MS/myfirstapp
		String result = client.callGreetOfFirstMS();
		return result;
	}
	
}
