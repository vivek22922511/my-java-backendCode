package com.practiceInterfaceDefaultMethod;

public class UpiPayment implements IPayment {

	@Override
	public void pay() {
		System.out.println("UpiPayment.pay()");
		IPayment.calculationTxnFees(1000, 20);
	}

	@Override
	public void status() {
		System.out.println("UpiPayment.status()");
		
	}

}
