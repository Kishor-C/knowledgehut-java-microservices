package com.examples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// bean id will be 'a'
@Component
public class A {
	@Autowired
	private B b;
	
	public void demo() {
		b.test();
	}
}
