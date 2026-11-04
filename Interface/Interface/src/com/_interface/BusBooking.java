package com._interface;

public class BusBooking  implements IDiscount
{

	@Override
	public int calculateDiscount(int amount, int rate) {
		
		return 0;
	}
	
	
	public void calculateDiscountTax(int tax) {
		System.out.println("BusBooking.calculateDiscountTax()");
		
	}
	
	

}
