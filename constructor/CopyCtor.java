package com.Constructor;

class Customer{
		String name;
		String num;
		
	Customer(String name,String num){
		this.name=name;
		this.num=num;
	}
	
	//Java does not automatically provide a copy constructor,
	//but you can create one yours
	
	Customer(Customer ram){
		
		this.name=ram.name;
		this.num=ram.num;
	}
}

public class CopyCtor {

	public static void main(String[] args) {
		
		Customer c=new Customer("vivek","1234");
		Customer c1=new Customer(c);
		
		System.out.println(c1.name+" "+c1.num);

	}

}
