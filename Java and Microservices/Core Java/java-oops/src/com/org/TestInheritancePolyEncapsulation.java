package com.org;

public class TestInheritancePolyEncapsulation {

	public static void main(String[] args) {
		//1. Checking the polymorphic behavior
		Employee employee = new Employee(100, "Raj", 35, 450000);
		Student student = new Student("Vijay", 20, 444, "A+");
		Person person = new Person("Ajay", 45);
		person.display();
		employee.display();
		student.display();
		System.out.println("------------------");
		//2. passing employee & student both to the same method that calls display
		view(student);
		view(employee);
		view(person);
	}
	
	//single method that accepts both employee & student
	public static void view(Person p) {
		p.display(); // this is polymorphic it can call display on either student or person or employee
		System.out.println("**********************************");
	}

}
