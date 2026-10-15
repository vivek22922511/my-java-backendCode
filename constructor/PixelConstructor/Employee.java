package com.PixelConstructor;

public class Employee {


	    int id;
	    String name;
	    //constructor..............first
	    Employee() {
	        id = 0;
	        name = "ram";
	    }

	    //constructor..............second
	    Employee(int id) {
	        this.id = id;
	        name = "shyam";
	    }

	    //constructor..............third
	    Employee(int id, String name) {
	        this.id = id;
	        this.name = name;
	    }

	    public static void main(String[] args) {

	        Employee e1 = new Employee();
	        Employee e2 = new Employee(101);
	        Employee e3 = new Employee(102, "Raj");

	        System.out.println(e1.id + " " + e1.name);
	        System.out.println(e2.id + " " + e2.name);
	        System.out.println(e3.id + " " + e3.name);
	    }
	}

