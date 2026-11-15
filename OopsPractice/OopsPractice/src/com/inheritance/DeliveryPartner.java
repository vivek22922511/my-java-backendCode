package com.inheritance;

 
public class DeliveryPartner {

	String id;
	String name;
	
	public void doDelivery() {
		
		System.out.println("DeliveryPartner.doDelivery()");
	}
	
	
class Zometo extends DeliveryPartner
{
@Override	//<----it check the rule of overriding  
/*
 * Rule of override?
 * 1.method name should be same
 * 2.number of args should be same
 * 3.order of argument should be same
 * 4.type of arguments shouls be saame
 * 5.return should be same except co-varent
 * 6.modefire should be same or wider
 * 7.static method can not be override
 * 8.private method can not be override.  
**/
public void doDelivery() {
		
		System.out.println("DeliveryPartner.doDelivery()");
	}
	
}
	
class Ekart extends DeliveryPartner
{
		
		
}
}
