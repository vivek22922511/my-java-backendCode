package com.practiceInterfaceDefaultMethod;

public class CardPayment implements IPayment {

	@Override
	public void pay() {
	System.out.println("CardPayment.pay()");
	IPayment.calculationTxnFees(1000, 20);
		
	}

	@Override
	public void status() {
		System.out.println("CardPayment.status()");
		
	}
//here we are using the default method...
	@Override
	public void checkBalance() {
		System.out.println("CardPayment.checkBalance()");
	}
}
