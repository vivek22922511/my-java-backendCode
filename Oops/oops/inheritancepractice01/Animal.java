package com.oops.inheritancepractice01;

public class Animal {
	
	public void eat() {
		System.out.println("Animals are eating.....");
	}

	
}

class Dog extends Animal{
	
	void bark() {
		System.out.println("Dogs are barking....");
	}
}
