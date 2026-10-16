package com.oops.inheritancepractice01;

class parents{
	

	void show(int age) {
		System.out.println("Parents age is->"+age);
	}
}
// there is two method with same name but different parameter.
//this is method overloading..
class Child extends parents{
	void show(String name) {
		System.out.println("My parent name is ->"+name);
	}
	
}



public class InheritanceWithOverloading {

	public static void main(String[] args) {
		
		Child child=new Child();
		
		child.show(42);
		child.show("Pavindre Singh");

	}

}
