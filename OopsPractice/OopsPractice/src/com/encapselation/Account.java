package com.encapselation;

public class Account {

	private String name;
	private  String accountNo;
	private int balance;
	
	public Account(String name,String accountNo,int balance) {
		
		super();
		
		this.name=name;
		this.accountNo=accountNo;
		this.balance=balance;
		
	}
	public int doCredit(int amount) {
		
		if(amount>0) {
			this.balance= balance+amount;
			
		}
		return balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}


	}
	

