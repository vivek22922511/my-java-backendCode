package com.polymorphismOpenClosePrinciple;

public class Driver {
public static void main(String[] args) {
	
	DeliveryProcessor dp=new DeliveryProcessor();
	dp.processDelivery(new Zometo());
	dp.processDelivery(new ExpressBee());
}
}
