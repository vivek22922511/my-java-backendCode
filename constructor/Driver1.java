package com.ConstructorPractice;

class Students {

    Students() {
        this(10);
        System.out.println("A");
    }

    Students(int x) {
        System.out.println("B");
    }
}

public class Driver1 {
    public static void main(String[] args) {
        Students s = new Students();
    }
}