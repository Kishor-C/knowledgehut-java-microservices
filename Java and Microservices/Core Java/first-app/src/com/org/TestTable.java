package com.org;

public class TestTable {
	public static void main(String[] args) {
		// create a table object
		Table t1 ; // creating a reference but no object is created
		t1 = new Table(2, 4); // rows = 2, cols = 4
		
		t1.printCells();
		Table t2 = new Table(3, 3); // rows = 3, cols = 3
		
		t2.printCells();
	}
}

