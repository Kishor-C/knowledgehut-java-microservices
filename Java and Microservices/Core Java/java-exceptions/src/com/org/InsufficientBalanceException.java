package com.org;

@SuppressWarnings("serial")
public class InsufficientBalanceException extends Exception {
	// Recommended to have 2 constructors 
	public InsufficientBalanceException() {
		super("Sorry, Balance is insufficient");
	}
	
	public InsufficientBalanceException(String message) {
		super(message);
	}
}
