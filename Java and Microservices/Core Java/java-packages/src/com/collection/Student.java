package com.collection;

public class Student {
	private int rollNo;

	public Student(int rollNo) {
		super();
		this.rollNo = rollNo;
	}

	@Override
	public int hashCode() {
		return 20;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (rollNo != other.rollNo)
			return false;
		return true;
	}
	
}
