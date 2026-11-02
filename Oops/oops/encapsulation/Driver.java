package com.oops.encapsulation;

public class Driver {

	public static void main(String[] args) {
		
		
		//before encapsulate code
		//we are able to modify balance through Driver class
		
//		...................................
//		Payment p=new Payment(1000);
//		p.doCredit(500);
//		 p.balance=2000;
//		System.out.println(p.balance);
//		System.out.println(balance);//2000
//      ........................................
		
		
		
		//after encapsulation
		
		Payment p=new Payment(1000);
		p.doCredit(500);
		//p.balance=2000;//not visible
		System.out.println(p.getBalance());
		
		
		
		
	}
}
