package com._interface05;

public class Main {
	
	//this is marker interface cloning, example
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Account acc=new Account("vivek","BSR","22922511");
		
		Account acc1= (Account) acc.clone();//trying to clone 
		
		System.out.println(acc1.name);
		
		
		
		if(acc instanceof Cloneable) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		
	}
	
	

}
