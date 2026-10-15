package com.oops.encapsulationPractice;

public class MainOfStudent {

	public static void main(String[] args) {
		
		Student s=new Student("vivek",22);
		
	//	System.out.println(s.getAge());
		//s.setAge(12);
		s.setAge(-1);//Invalid age..!
		System.out.println(s.getAge());
		
	//	System.out.println(s.getName());
		
		s.setName("shirin");
		System.out.println(s.getName());
	}

}
