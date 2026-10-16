package com.oops.inheritancepractice01;

 class Person {
	String name="vivek";
}

class Student extends Person{
	int age=22;
}



public class InheritanceWithVariables {

	public static void main(String[] args) {
		Student s=new Student();
		
	System.out.println(s.name);
	
	System.out.println(s.age);
	
//  output:vivek
//	        22


	}

}
