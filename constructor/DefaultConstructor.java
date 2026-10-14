package com.Constructor;

class Student {

	int id;
	String name;

}

// Java provides a default constructor
// automatically if no constructor is written 

class student {

}

public class DefaultConstructor {

	public static void main(String[] args) {

		// call to a ctor

		Student s = new Student();
		
		System.out.println(s.id);
		System.out.println(s.name);

	}

}
