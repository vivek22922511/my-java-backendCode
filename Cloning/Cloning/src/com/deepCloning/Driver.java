package com.deepCloning;

public class Driver {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Addresss addresss=new Addresss("uttar pradesh", "Bulandshahr","Hingwara");
		
		Employeee emp=new Employeee("vivek rajput","vk001", addresss);
		
	Employeee clonedEmp=(Employeee) emp.clone();
	
	emp.address.distric="meerut";
	
	System.out.println(emp.address.distric);
	System.out.println(clonedEmp.address.distric);
	}
}
