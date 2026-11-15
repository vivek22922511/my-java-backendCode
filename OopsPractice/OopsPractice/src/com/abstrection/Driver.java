package com.abstrection;
/*
 * Abstrection mean to hide the core functionalities of any class
 * 
 * why we need to hide?
 * ans-:Because we want to show only required functionalities.
 *  ex:remote we can see only butten not the coding behind it..
 *  if they expose the coding behind the remote people start play with the system.
 * 
 * 
 * what happens if wew will not private our core functionalities?
 * ans-: they will start calling directly to that method that's why we hide..
 *  */
public class Driver {
	
	public static void main(String[] args) {
		
		IciciBank accBank=new IciciBank(2000, "1234");
		
		accBank.credit(100);
		System.out.println("your balance is-:"+accBank.getBalance());
	}

}
