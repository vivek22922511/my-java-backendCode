package com.oops.encapsulation;

public class Payment {

    private int balance;//variable 
	
	//ctor
	public Payment(int balance) 
	   {
		this.balance=balance;
		
		}
	
	//method 1
	//setter method
	public void doCredit(int amount) {
			
	if(amount>0) {
		balance=balance+amount;
	}
	
	}//method 2
	public void doDebit(int amount) 
	{
		if(amount>=balance) {
			
		balance=balance-amount;
		
		}
		
	}
	//Getter method
	public int getBalance() {
		return balance;
	}
	
}
