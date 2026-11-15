package com.polymorphism;


class Delivery
{
	public void doDelivery() {
		System.out.println("Delivery.doDelivery()...doDelivery");
	}
	

}
class ExpressBee extends Delivery{
	
    public void doDelivery() {
		System.out.println("ExpressBee.doDelivery()");
	}
}
class Ekart extends Delivery{
	
public void doDelivery() {	
		System.out.println("Ekart.doDelivery()");
	}
}



public class Driver {
public static void main(String[] args) {
	
//Delivery delivery=new Delivery();
	
	/*
        //compile time- delivery.doDelivery()-> 
		//it will check that doDelivery() is present in Delievery class
    	//if this method is not there then it will check in object class
	    
		//runtime--> it will call the method of Delivery class
	 * 
	 * */
	
//delivery.doDelivery();//compile time
	
	
	
	   //parent class can refer child class
	Delivery delivery1=new ExpressBee();//up-casting
	delivery1.doDelivery(); 
	 
	
	Delivery ekrt=new Ekart();
	Ekart ekart=(Ekart) ekrt;//down-casting
	ekart.doDelivery();
	
}
}
