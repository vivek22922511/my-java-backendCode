package com.oops.polymorphismSOLIDprinciple_OCP;

public class Main {

	public static void main(String[] args) {
		
		DeliveryProcessor dp = new DeliveryProcessor();
		 
		dp.processorDelivery(new Ekart());
		
		dp.processorDelivery(new Zometo());
	
		

	}  

}
 