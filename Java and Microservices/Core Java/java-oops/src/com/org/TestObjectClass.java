package com.org;

public class TestObjectClass {
	public static void main(String[] args) {
		Person p = new Person("Raj", 42);
		System.out.println(p); // it calls toString() of Object
		Employee e = new Employee(100, "Vijay", 23, 42500);
		System.out.println(e);
		Student s = new Student("Manu", 444, 30, "A");
		System.out.println(s);
	}
}
