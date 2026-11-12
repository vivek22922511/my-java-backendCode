package com.ThreadingSynchronization01;

public class TransferThread2 extends Thread {
	private BankAccount sender;
	private BankAccount recever;
	/**
	 * @param sender
	 * @param recever
	 */
	public TransferThread2(BankAccount sender, BankAccount recever) {
		super();
		this.sender = sender;
		this.recever = recever;
	}
	
	public void run() {
		sender.transfer(recever, 600);
	}
	
}
