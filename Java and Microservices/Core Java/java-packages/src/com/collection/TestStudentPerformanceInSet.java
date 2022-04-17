package com.collection;

import java.util.HashSet;
import java.util.Set;

public class TestStudentPerformanceInSet {

	public static void main(String[] args) {
		Set<Student> set = new HashSet<Student>();
		
		for(int i = 1; i <= 10000; i++) {
			Student s = new Student(i);
			set.add(s);
			System.out.println("Added student rollNo: "+i);
		}
		System.out.println("---- Finished ----");
	}

}
