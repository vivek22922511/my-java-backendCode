package com.Constructor;

class Employee{
	int id;
	String name;
	String phoneNumber;
	
	
	Employee(int _id,String _name,String _phoneNumber){
		
		this.id=_id;
		this.name=_name;
		this.phoneNumber=_phoneNumber;
	}
	
}

public class PerameterizedCtor {

	public static void main(String[] args) {
		
		Employee e=new Employee(11, "vivek rajput","8954907847");
		Employee e1=new Employee(12, "vivek rajput","9954907847");
		Employee e2=new Employee(13, "vivek rajput","7954907847");
		
		System.out.println(e.id+" "+e.name+" "+e.phoneNumber);
		System.out.println(e1.id+" "+e1.name+" "+e1.phoneNumber);
		System.out.println(e2.id+" "+e2.name+" "+e2.phoneNumber);
		
	}
}
