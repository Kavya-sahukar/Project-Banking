package com.icici;

public class BankImpl implements Bank {
	
	int balance;
	BankImpl(int balance){
	this.balance=balance;	
	}
	@Override
	public void deposit(int amount) {
		// TODO Auto-generated method stub
		System.out.println("deposited amount Rs"+amount);
		balance+=amount; //balance=balance+amount;
		System.out.println("amount deposited");
	}
	@Override
	public void withdraw(int amount) {
		// TODO Auto-generated method stub
		if(amount<=balance) {
			System.out.println("deposited amount Rs"+amount);
			balance-=amount;	//balance=balance-amount;
			System.out.println("amount withdrawn");
		}
		else {
			try {
			 throw new InsufficientBalanceException("Insufficient Balance!");
		} 
			catch(Exception e) {
			System.out.println(e.getMessage());
		}}	
	}
	@Override
	public int getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}
}
