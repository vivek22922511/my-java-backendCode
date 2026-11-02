package com.oops.encapsulationPractice;

public class MainOfEmployee {
			
	public static void main(String[] args) {
		
		Employee e=new Employee();
		
		e.setSalary(2300);
		System.out.println(e.getSalary());
		
		e.setSalary(-2300);
		System.out.println(e.getSalary());
	}
}
