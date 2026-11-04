package com._interface;

public class Driver {
public static void main(String[] args) {
	
	IDiscount discount=new FlightBooking();
	
	int result=discount.calculateDiscount(1000, 10);
	System.out.println(result);
	
}
}
