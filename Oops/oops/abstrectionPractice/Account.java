package com.oops.abstrectionPractice;

public class Account {
	//hide the core method or fun
	public void  doCredit(){
		
		checkBalance();
		checkPin();
		
		System.out.println("Account.doCredit() successful transfer..");
	}

	
	private int checkBalance() 
	{
		System.out.println("Account.checkBalance()... balance chacked..");
		return 10000;
	}
	
	private boolean checkPin() 
	{
		System.out.println("Account.checkPin() pinn checked");
		return true;
	}
}
