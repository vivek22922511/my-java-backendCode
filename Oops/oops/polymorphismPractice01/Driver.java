package com.oops.polymorphismPractice01;

class Delivery {
     void doDelivery()
	{
		System.out.println("delevery class called.....");
	}

}

class Zepto extends Delivery {
       @Override
	   void doDelivery()
		{
			System.out.println("Zepto class called.....");
		}
}

class Zometo extends Delivery{
	@Override
	   void doDelivery()
		{
			System.out.println("Zometo  class called.....");
		}
}
public class Driver {

	public static void main(String[] args) {

		//parents can refer chile class obj..
		Delivery d1=new Zepto();
		//compile time->>it checks the method in
		d1.doDelivery();
		
		
		Zometo z1=(Zometo)new Delivery();
	
		z1.doDelivery();
	}

}
