package com.oops.inheritancepractice02;

class Animals {

	void eat() {

		System.out.println("Animal is eating.....");
	}
}

class Dogs extends Animals {

	void bark() {

		System.out.println("Dog is barking... ");
	}
}

class Puppy extends Dogs {

	void cry() {

		System.out.println("puppy is creing....");
	}
}

public class MultilevelInheritance {

	public static void main(String[] args) {

		Puppy p = new Puppy();
		p.cry();
		p.eat();
		p.bark();

	}

}
