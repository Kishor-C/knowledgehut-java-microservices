package com.org;

public class Student extends Person {

	// student inherits person properties and behaviour
	private int rollNo;
	private String grade;
	public Student(String name, int age, int rollNo, String grade) {
		super(name, age);
		this.rollNo = rollNo;
		this.grade = grade;
	}
	public int getRollNo() {
		return rollNo;
	}
	public String getGrade() {
		return grade;
	}
	@Override
	public void display() {
		System.out.println("*******Student Display******");
		System.out.println("RollNo = "+getRollNo()+", Name = "+getName()+", Age = "+getAge()+", Grade = "+getGrade());
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", grade=" + grade + ", getRollNo()=" + getRollNo() + ", getGrade()="
				+ getGrade() + "]";
	}
	
}
