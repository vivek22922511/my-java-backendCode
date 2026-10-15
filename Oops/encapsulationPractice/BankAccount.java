package com.oops.encapsulationPractice;

public class BankAccount {

	private double balance;

	public BankAccount(double balance) {

		this.balance = balance;

	}

	public double getBalance() {
		return balance;
	}

	public void doDeposit(double amount) {
		if (amount >0)
		{
			balance = balance + amount;
		} 
		else
		{
			System.out.println("Invalid amount...!check it");
		}
	}
	
	public void doWithdraw(double amount) {
		if(amount>0 && amount<=balance) {
			balance=balance-amount;
		}else
		{
			System.out.println("Invalid withdraw....!");
		}
	}
}
