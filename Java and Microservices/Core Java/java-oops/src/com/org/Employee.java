package com.org;

public class Employee extends Person {
	// name & age is inherited in the form of getters & setters
	private int id;
	private double salary;
	
	// This initializes employee id, name, age, salary
	public Employee(int id, String name, int age, double salary) {
		super(name, age); // this calls the Person(name, age)
		this.id = id;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public double getSalary() {
		return salary;
	}
	
	@Override
	public void display() {
		System.out.println("********Employee Display*******");
		System.out.println("Id = "+getId()+", Name = "+getName()+", Age = "+getAge()+", Salary = "+getSalary());
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + ", toString()=" + super.toString() + "]";
	}

	
	
	
}
