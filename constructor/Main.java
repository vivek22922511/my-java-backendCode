package com.ConstructorPractice1;

class Student {

    Student() {
        this(10);
        System.out.println("A");
    }

    Student(int x) {
        System.out.println("B");
    }

    Student(String name) {
        this();
        System.out.println("C");
    }

}

public class  Main{
	public static void main(String[] args) {
	    Student s = new Student("Rahul");
	}
}

