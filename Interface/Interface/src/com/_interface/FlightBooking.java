package com._interface;

public class FlightBooking implements IDiscount 
{

	@Override
	public int calculateDiscount(int amount, int rate) {
		int finalFare=amount-(amount*rate)/100;
		return finalFare;
	}
	
	
	
	public void calculateDiscountTax(int tax) {
		
		System.out.println("FlightBooking.calculateDiscountTax()");
		
	}

	
	
}
