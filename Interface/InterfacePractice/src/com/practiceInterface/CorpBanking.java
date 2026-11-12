package com.practiceInterface;

public class CorpBanking implements IBanking{

	@Override
	public void payment() {
		System.out.println("CorpBanking.payment()");
		
	}

	@Override
	public void stopCheque() {
		System.out.println("CorpBanking.stopCheque()");
		
	}

	@Override
	public void suspendPayment() {
		System.out.println("CorpBanking.suspendPayment()");
		
	}

	@Override
	public void stopPayment() {
		System.out.println("CorpBanking.stopPayment()");
		
	}

}
