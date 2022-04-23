package com.examples;

public class TestService {
	
	private TestDao dao;
	
	public TestService(TestDao dao) {
		// scenario 1 where we create object
		//dao = new TestDao1();
		//scenario2 where spring supplies object via constructor argument
		this.dao = dao;
	}
	// scenario2 where framework passes dao and intializes dao
	public void setDao(TestDao dao) {
		this.dao = dao;
	}
	
	public void store() {
		dao.store();
	}
	
	public void delete() {
		dao.delete();
	}
	
	
}
