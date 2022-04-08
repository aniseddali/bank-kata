package com.kata.bankAccount;

import org.junit.Test;
import com.kata.bankAccount.Account;

public class TestAccount {
    @Test
    public void testBalance() {
    	Account a = new Account();//balance =0
    	assert(a.getBalance() == 0);
    	a.withdrawal(1000); //balance =0
    	assert(a.getBalance() == 0);
    	a.deposit(5000); //balance =5000
    	assert(a.getBalance() == 5000);
		a.withdrawal(3000); //balance =2000
		assert(a.getBalance() == 2000);
		a.withdrawal(4000); // operation not allowed balance =2000
		assert(a.getBalance() == 2000);
		a.deposit(1000); //balance =3000
		assert(a.getBalance() == 3000);
		a.withdrawal(500); //balance =2500
		assert(a.getBalance() == 2500);
    }
}