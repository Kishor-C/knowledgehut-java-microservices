package com.examples;

import org.springframework.stereotype.Component;

// this registers the object in spring container the name of the object i.e., id is same as class name
// but name starts with lower case i.e., 'b'
@Component
public class B {
	public void test() {
		System.out.println("test() inside B");
	}
}
