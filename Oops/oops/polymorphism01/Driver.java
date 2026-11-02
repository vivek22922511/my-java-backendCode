package com.oops.polymorphism01;

class Employee{

	public void  markIn() {
		System.out.println("Employee.markIn()...Employee marking in");
	}
}

class HrManager extends Employee{
	
	@Override
	public void markIn() {
		System.out.println("HrManager.markIn()..... hrManager marking in.");
	}
}

public class Driver {
public static void main(String[] args) {
	
	Employee e1=new Employee();
	
	
	Employee e2=new HrManager();
	e2.markIn();
	//!.At the time of compilation,it will check the method exits in class Employee.
	//!!.At the time of execution,it will call the method on actual object.
}
}
