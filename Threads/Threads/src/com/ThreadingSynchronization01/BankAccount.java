package com.ThreadingSynchronization01;

public class BankAccount {

	private int balance =1000;
	// this is method synchronized
	public /*synchronized*/  void  transfer(BankAccount recever,int amount) {
		
		System.out.println(" 20 line of code -- Sending email notification....requested the fund transfered");
		
		// this is block synchronized
		synchronized(this) {//for batter performance...synchronized block.
			
			if(balance>=amount) {
				System.out.println(" ["+Thread.currentThread().getName()+"] check balance:  "+balance);
				try {
					Thread.sleep(100);
				}catch(InterruptedException e)
				{
					e.printStackTrace();
					
				}
				balance=balance-amount;
				recever.balance=recever.balance+amount;
				System.out.println(" ["+Thread.currentThread().getName()+"] transfered :  "+amount);
			}else {
				System.out.println(" ["+Thread.currentThread().getName()+"] Insufficient balance");
			}
		}
		
		
		System.out.println(" 20 line of code -- Sending email notification....completed the fund transfered");

	}
	
	
	public int getBalance() {
		return balance;
	}
}
