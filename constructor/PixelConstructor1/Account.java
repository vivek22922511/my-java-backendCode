package com.PixelConstructor1;

public class Account{
		int amount;
		String name;
		
		//if developer is not providing any constructor in a class then jvm create itself
		
		Account(){
			System.out.println("inside Account() ");
		}
		
		Account(int _amount, String _name){
			
			System.out.println("inside Account(int _amount, String _name)");
			this.name=_name;
			this.amount=_amount;
		}
	}



