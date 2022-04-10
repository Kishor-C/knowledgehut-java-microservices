package com.org;

public class Fundamentals {

	public static void main(String[] args) {
		float f1 = 41.0F; 
		System.out.println("f1 = "+f1);
		int i1 = 2;
		int i2 = i1++; // i2 = 2
		System.out.println("i2 = "+i2);
		System.out.println("i1 = "+i1);
		if(i1 == 3) {
			System.out.println("i1 is 3");
		} else {
			System.out.println("i1 is not 3");
		}
		System.out.println("---for loop----");
		for(int i = 1; i <= 5; i++) {
			System.out.println("i = "+i);
		}
		System.out.println("-----while loop--------");
		while(i1 < 5) {
			System.out.println("i1 = "+i1);
			i1++;
		}
		System.out.println("----do while loop------");
		do {
			System.out.println("i1 = "+i1);
		} while(i1 < 5);
		System.out.println("--- switch cases ----");
		// you can use int or string or char or enum
		String option = "xyz";
		switch(option) {
		case "a": System.out.println("print a"); 
			break;
		case "b": System.out.println("print b"); 
			break;
		default: 
			System.out.println("no case matched: "+option);
		}
	}

}
