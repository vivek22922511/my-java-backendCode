package com.practiceInterface;

public class PersonalBanking implements IBanking{

	@Override
	public void payment() {
		System.out.println("PersonalBanking.payment()");
	}

	@Override
	public void stopCheque() {
		System.out.println("PersonalBanking.stopCheque()");
		
	}

	@Override
	public void suspendPayment() {
		System.out.println("PersonalBanking.suspendPayment()");
		
	}

	@Override
	public void stopPayment() {
		System.out.println("PersonalBanking.stopPayment()");
		
	}

}
