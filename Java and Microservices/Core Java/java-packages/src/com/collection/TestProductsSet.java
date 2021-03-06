package com.collection;

import java.util.HashSet;
import java.util.Set;

public class TestProductsSet {
	public static void main(String[] args) {
		Products p1 = new Products(333, "Laptop", 45000);
		Products p2 = new Products(222, "Microwave", 25000);
		Products p3 = new Products(111, "Mobile", 35000);
		Products p4 = new Products(222, "Microwave", 25000);
		
		Set<Products> set = new HashSet<Products>();
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		System.out.println("P2 hashCode: "+p2.hashCode());
		System.out.println("P4 hashCode: "+p4.hashCode());
		System.out.println("equality: "+p2.equals(p4));
		for(Products p : set) {
			System.out.println(p);
		}
	}
}
