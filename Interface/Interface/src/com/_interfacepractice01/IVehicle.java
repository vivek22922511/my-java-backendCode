package com._interfacepractice01;

public interface IVehicle {
	
	//java 7.. public abstract method(100 % contract based..).
	public abstract void start();
	
	                void stop();
	                
	                //java 8......default method(optional)
	                
	public default void electricBattery() {
		
		//connecting to db(100 line )and other code 500 line
		System.out.println("electricBattery()...");
		
	}
	
	public default void electricMotor() {
		
		//connecting to db(100 line ) and other code 500 line
		
		connectDB();
		
		System.out.println("electricMotor()...");
		
	}
	
	//there are two method 100 line code same for every default method 
	// to //java 9  introduce private method to remove duplicate line of code 
	
	
	private void connectDB() {//now we can directly call to this method inside our method 
		System.out.println("Vehicle.connectDB()......");
	}
	
	
	
	
	
	
	//java 8...... utility method 
	
	public static void fuel(String petrol ,String diesal) {
		//100 line of code 
		
		
		System.out.println("Vehicle.fuel().....static method ...");
	}
	
	
}
