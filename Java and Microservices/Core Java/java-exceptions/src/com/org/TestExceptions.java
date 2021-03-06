package com.org;

import java.sql.SQLException;

public class TestExceptions {
	public static void main(String[] args) {
		// if main is the caller for store
		store(1);
		// if main can decide what to do with the exception
		try {
			delete(-1);
		} catch (SQLException e) {
			// you can show error pages or return error messages
			e.printStackTrace();
		}
	}
	public static void abc(int x) {
		if(x < 0) {
			throw new ArithmeticException();
		}
		System.out.println("abc() DONE...");
	}
	// when store knows what to do with the exception
	public static void store(int x) {
		if(x < 0) {
			try {
				throw new SQLException();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		System.out.println("store() DONE..");
	}
	// when delete doesn't know what to do with the exception instead it gives option to caller to decide
	public static void delete(int x) throws SQLException {
		if(x < 0) {
			throw new SQLException();
		}
		System.out.println("delete() DONE....");
	}
	
}
