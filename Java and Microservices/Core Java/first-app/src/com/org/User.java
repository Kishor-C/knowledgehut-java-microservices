package com.org;

public class User {
	
	private int userId;
	private String name;
	private int age;
	
	public User(int userId, String name, int age) {
		this.userId = userId;
		this.name = name;
		this.age = age;
	}
	public int getUserId() {
		return userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
