package com.examples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans2.xml");
		
		A a1 = (A) context.getBean("a"); // a is the id of 'A' object and it has B object injected through @Autowired
		a1.demo(); // demo() calls b.test()
		
		ClassPathXmlApplicationContext cpxa = (ClassPathXmlApplicationContext)context;
		cpxa.close();
	}
}
