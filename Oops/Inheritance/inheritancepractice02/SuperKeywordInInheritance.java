package com.oops.inheritancepractice02;


class Vehicle{
	
	void wheels() {
		System.out.println("Car has for wheels......");
	}
}
class Bike extends Vehicle{
	
	@Override
	void wheels() {
		super.wheels();
		System.out.println("Bike has two wheels");
	}
}


public class SuperKeywordInInheritance {

	public static void main(String[] args) {
		
		
		Bike b=new Bike();
		b.wheels();
		

	}

}
