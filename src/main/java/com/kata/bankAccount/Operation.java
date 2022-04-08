package com.kata.bankAccount;

import java.util.Date;

public class Operation {
	private final int amount;
	private final int balance;
	private final OperationType opType;
	private final Date date ;
	private final boolean succes;
	
	public Operation(OperationType opType, int amount, int balance, boolean succes) {
		this.date = new Date();
		this.amount = amount;
		this.opType = opType;
		this.balance = balance;
		this.succes = succes;
	}

	@Override
	public String toString() {
		return "date="+date+" opType="+opType+" amount="+amount+" balance="+balance+" succes="+succes;
	}

}
