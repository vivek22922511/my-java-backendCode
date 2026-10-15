package com.PixelConstructor1;

public  class User {

	public static void main(String[] args) {
		Account acc=new Account();
		
		System.out.println(acc.amount+"& "+acc.name);
		
		Account acc1=new Account(3333,"hlo");
		
		System.out.println(acc1.amount+"& "+acc1.name);
	}

}
