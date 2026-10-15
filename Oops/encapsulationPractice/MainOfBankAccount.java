package com.oops.encapsulationPractice;

public class MainOfBankAccount {

	public static void main(String[] args) {
		
		BankAccount account=new BankAccount(1284);
		
//		account.doDeposit(6);
//		System.out.println(account.getBalance());
		
//		account.doWithdraw(10);
//		System.out.println(account.getBalance());
		
		account.doDeposit(-10);//output:-Invalid amount...!check it
		System.out.println(account.getBalance());
	}
}
