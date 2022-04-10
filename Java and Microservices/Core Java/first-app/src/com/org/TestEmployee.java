package com.org;

public class TestEmployee {
	public static void main(String[] args) {
		Employee e1 = new Employee(100, "Ajay");
		Employee e2 = new Employee(200, "Babu");
		
		//Employee.companyName = "Xyz org";
		e1.display();
		e2.display();
	}
}
