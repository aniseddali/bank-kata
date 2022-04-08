package com.kata.bankAccount;

import java.util.ArrayList;
import java.util.List;

public class Account {
	
	//list of account operations
	List<Operation> ops = new ArrayList<Operation>();
	private int balance=0;
	
	public int getBalance() {
		return balance;
	}
	
	//deposit and save operation
	public void deposit(int amount) {
		balance+=amount;
		Operation op = new Operation(OperationType.DEPOSIT, amount, balance, true);
		ops.add(op);
	}
	
	//withdrawal and save operation
	public void withdrawal(int amount) {
		boolean success=false;
		if(amount<=balance) {
			balance-=amount;
			success=true;
		}
		Operation op = new Operation(OperationType.WITHDRAWAL, amount, balance, success);
		ops.add(op);
	}
	
	// print balance and operations
	public void printStatement() {
		System.out.println("balance="+balance);
		ops.stream().forEach(o->System.out.println(o.toString()));
	}

	
}
