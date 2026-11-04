package com._interface04;

public class Main02 {

	public static void main(String[] args) {
		
		IAccount02 account = (naam,add,amount)->
		
		{
		
			return "account opend..";
		};
		
		String result=account.openAccount("vivek rajput", "Bulandshahr",999999);
				 System.out.println();
	}
}
