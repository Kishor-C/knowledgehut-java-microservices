package com.examples;

public class TestDao1 implements TestDao {

	@Override
	public void store() {
		System.out.println("store() inside TestDao1");
	}

	@Override
	public void delete() {
		System.out.println("delete() inside TestDao1");
	}

}
