package com._interface;

public interface IDiscount {

	public static final int MAX_VALUE=100;//public static final-->constant
	
	
	//public abstract  int calculateDiscount
	
	public abstract  int calculateDiscount(int amount,int rate);
	
	public abstract void calculateDiscountTax(int tax);
	
}
