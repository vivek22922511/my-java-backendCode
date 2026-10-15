package com.PixelConstructorProject2;

public class Person {

	protected String name;
	protected int age;

	Person(String _name, int _age) {
		this.name = _name;
		this.age = _age;
	}

	void displayPerson() {
		System.out.println("Name : " + name);
		System.out.println("Age  : " + age);
	}
}
