package com.examples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestControllerMain {
	public static void main(String[] args) {
		// this is acting like a controller, it needs service object
		// you can use application context to get the reference of container, 
		// ClassPathXmlApplicationContext initializes the spring container
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");
		TestService service = (TestService) context.getBean("i2"); // service <- dao
		service.store(); // service -> dao.store();
		service.delete();// service -> dao.delete()
		
		//closing the resources - best practice 
		ClassPathXmlApplicationContext cpxa = (ClassPathXmlApplicationContext)context;
		cpxa.close();
	}
}
