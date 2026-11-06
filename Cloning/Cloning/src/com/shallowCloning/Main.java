package com.shallowCloning;

public class Main {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Address address=new Address("1st stage", "5th cross","Meerut");
		
		Employee emp=new Employee("vivek","vk001",address);
		
		Employee clonedEmp=(Employee) emp.clone();
		

		//i am changing the actual city name 
		     emp.address.city="delhi";
		//or
//		      clonedEmp.address.city="delhi";
		
		System.out.println(emp.address.city);
		System.out.println(clonedEmp.address.city);
	}

}
