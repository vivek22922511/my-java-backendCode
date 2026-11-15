package com.abstrection;

public class IciciBank {

	private int balance;
	private String pin;

	/**
	 * @param balance
	 */
	public IciciBank(int balance,String pin) {
		super();
		this.balance = balance;
		this.pin=pin;
	}
	
	public void credit(int amount) {
		checkPin(pin);
		checkBalance(balance);
		
		
			this.balance=balance+amount;
		
	}
	
	
	
	private boolean checkPin(String pin) {
		if(pin!="1234") {
			System.out.println("Invalid Pin!!");
			
		}
		
		return true;
	}
	
	private Boolean checkBalance(int amount) {
		
		if(amount<0) {
			
			System.out.println("enter the valid balance");
			
		}
		
		return true;
	}
	
	public int getBalance() {
		return balance;
	}

	
}
