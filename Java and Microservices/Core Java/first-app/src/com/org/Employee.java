package com.org;

public class Employee {
	// instance variables
	final int id;
	String name;
	static final String companyName = "ABC org";
	Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	void display() {
		System.out.println("Id = "+id+", Name = "+name+", company = "+companyName);
	}
}
