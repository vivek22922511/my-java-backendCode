package com.oops.inheritance;

class Employee{
	
	String name="vivek";
	String address="Bulandshahr";
	
	public void markIn(String empId) {
		
		System.out.println("Mark In..."+empId);
	}
}

class Manager extends Employee{
	
public void doSomething() {
	
	System.out.println(name);
	System.out.println(address);
	
	
	markIn("001");
}
	
}

public class Driver {

	public static void main(String[] args) {
	
		Manager m=new Manager();
		
		m.doSomething();

	}

}
