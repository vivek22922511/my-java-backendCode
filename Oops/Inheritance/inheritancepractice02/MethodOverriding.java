package com.oops.inheritancepractice02;

//The child class change the implementation of a method inherited from the parent.

class Manager{
	
	void bonus() {
		
		System.out.println("Manager got bonus...");
	}
}

class Employee extends Manager{
	
@Override
	void bonus() {
		System.out.println("Employee get the bonus on monday...");
	}
}


//private methods are not overridden, and final methods cannot be overridden.
//Static methods are hidden, not overridden.



public class MethodOverriding {

	public static void main(String[] args) {
		
		Employee e=new Employee();
		e.bonus();
		e.bonus();
		
		
		
	}

}
