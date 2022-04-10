package com.org;

public class TestEncapsulation {

	public static void main(String[] args) {
		User u1 = new User(123, "Raj", 35);
		User u2 = new User(345, "Vijay", 45);
		
		System.out.println("Id = "+u1.getUserId()+", Name = "+u1.getName()+", Age = "+u1.getAge());
		System.out.println("Id = "+u2.getUserId()+", Name = "+u2.getName()+", Age = "+u2.getAge());
		u1.setName("Rajesh");
		System.out.println("Id = "+u1.getUserId()+", Name = "+u1.getName()+", Age = "+u1.getAge());
		
	}

}
