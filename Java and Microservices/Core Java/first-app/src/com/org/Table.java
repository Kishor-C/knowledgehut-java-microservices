package com.org;

public class Table {
	int rows;
	int cols;
	
	Table(int r, int c) {
		rows = r;
		cols = c;
	}
	void printCells() {
		int result = rows * cols;
		System.out.println("Result = "+result);
	}
}
