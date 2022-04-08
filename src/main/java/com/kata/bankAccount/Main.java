package com.kata.bankAccount;

public class Main {

	public static void main(String[] args) {
		Account a = new Account();
		a.deposit(5000);
		a.withdrawal(3000);
		a.withdrawal(4000);
		a.deposit(5000);
		a.withdrawal(5000);
		a.printStatement();
	}

}
