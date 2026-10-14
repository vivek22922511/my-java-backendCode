package com.ConstructorPractice;

class Student {
	//Interview tip: This is called constructor overloading.
	// A class has multiple constructors with different parameter lists,
	// and Java selects the matching constructor based on the arguments.

    Student() {
        System.out.println("A");
    }

    Student(int x) {
        System.out.println("B");
    }
}

public class Driver {
    public static void main(String[] args) {

        Student s1 = new Student();

        Student s2 = new Student(10);
    }
}