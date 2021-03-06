package com.org;

public class TestCustomException {

	public static void main(String[] args) {
		// atm machine code
		try {
			withdraw(50000);
		} catch (InsufficientBalanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.err.println("Message: "+e.getMessage());
		}
	}

	public static void withdraw(double amount) throws InsufficientBalanceException {
		double balance = 40000;
		if(amount > balance) {
			//throw new InsufficientBalanceException();
			throw new InsufficientBalanceException("Sorry your balance is "+balance+" can't withdraw "+amount);
		}
		balance = balance - amount;
		System.out.println("Amount debited, your balance is "+balance);
	}
}
