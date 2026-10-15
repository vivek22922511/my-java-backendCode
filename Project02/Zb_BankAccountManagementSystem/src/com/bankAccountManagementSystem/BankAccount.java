package com.bankAccountManagementSystem;

public class BankAccount {
	
	private int accountNumber;
	private String accountHolderName;
	private double balance;

	
	
	public BankAccount(int accountNumber, String accountHolderName, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}
	
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public String getAccountHolderName() {
		return accountHolderName;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName=accountHolderName;
	}

	public void setBalance(double balance) {
		this.balance=balance;
	}
	

}
