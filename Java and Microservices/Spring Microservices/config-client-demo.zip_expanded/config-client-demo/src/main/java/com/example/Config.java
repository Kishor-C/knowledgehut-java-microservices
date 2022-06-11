package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	// it fetches message property from the configuration file & supplies its value
	@Value("${message}")
	private String message;

	public String getMessage() {
		return message;
	}
	
}
