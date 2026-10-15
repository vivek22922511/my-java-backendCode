package com.bankAccountManagementSystem;

public class Transaction {

	private String type;
	private double amount;
	private double balanceAfterTransaction;

	public Transaction(String type, double amount, double balanceAfterTransaction) {
		this.type = type;
		this.amount = amount;
		this.balanceAfterTransaction = balanceAfterTransaction;
	}

	public String getType() {
		return type;
	}

	public double getAmount() {
		return amount;
	}

	public double getBalanceAfterTransaction() {
		return balanceAfterTransaction;
	}

	public void displayTransaction() {
		System.out.println("Type: " + type);
		System.out.println("Amount: " + amount);
		System.out.println("Balance after transaction: " + balanceAfterTransaction);
		System.out.println("--------------------------");
	}
}
