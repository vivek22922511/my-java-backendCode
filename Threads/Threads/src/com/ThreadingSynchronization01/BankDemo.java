package com.ThreadingSynchronization01;

public class BankDemo {

	public static void main(String[] args) throws InterruptedException {
		BankAccount account1=new BankAccount();
		BankAccount account2=new BankAccount();
		
		Thread phonePay=new TransferThread1(account1,account2);
		Thread gPay=new TransferThread2(account1,account2);
		//start the thread
		 phonePay.start();
		 
		 gPay.start();
		 
		 //join --> current thread will wait for other thread;;
		 phonePay.join();
		 gPay.join();
		 
		 System.out.println("Account 1:" +account1.getBalance());
		 System.out.println("Account 2:" +account2.getBalance());
	}
}
