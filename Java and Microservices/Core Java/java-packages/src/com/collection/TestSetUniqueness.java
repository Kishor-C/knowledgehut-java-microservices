package com.collection;

import java.util.HashSet;
import java.util.Set;

public class TestSetUniqueness {

	public static void main(String[] args) {
		Set<String> stringSet = new HashSet<String>();
		stringSet.add("hello");
		stringSet.add("HELLO");
		stringSet.add("welcome");
		stringSet.add("HELLO");
		for(String s : stringSet) {
			System.out.println(s);
		}
		System.out.println("----------------------");
		Set<Integer> intSet = new HashSet<Integer>();
		intSet.add(222);
		intSet.add(222);
		intSet.add(111);
		for(int i : intSet) {
			System.out.println(i);
		}
	}

}
