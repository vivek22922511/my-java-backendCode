package com.oops.encapsulationPractice;

public class Employee {
   
	private double salary;
	
//	public Employee(double salary) {
//		this.salary=salary;
//	}
	
	public void setSalary(double salary) {
		if(salary>=0)
		{
			this.salary=salary;
			
		}else
		{
			System.out.println("salary can not be negative...!");
		}
		}
	
	public double getSalary() {
		return salary;
	}
}
