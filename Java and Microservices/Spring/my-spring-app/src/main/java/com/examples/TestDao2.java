package com.examples;

public class TestDao2 implements TestDao {

	@Override
	public void store() {
		System.out.println("store() inside TestDao2");
	}

	@Override
	public void delete() {
		System.out.println("delete() inside TestDao2");
	}

}
