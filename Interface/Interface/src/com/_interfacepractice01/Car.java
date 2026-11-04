package com._interfacepractice01;

public class Car implements IVehicle{

	@Override
	public void start() {
		System.out.println("Car.start().....started.....");
		
	}

	@Override
	public void stop() {
		System.out.println("Car.stop() ......Stoped....");
		
	}
	@Override
	public void electricBattery() {
	
		System.out.println("Car.electriBattery()...this is a electric car...");
	}
	
	void fuel(String petrol ,String powerPetrol) {
	
		IVehicle.fuel("","");
	}
	
	
	
	

}
