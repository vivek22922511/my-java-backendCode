package com.staticblock;

public class Staticblock {

	String name ;
	String id;
	String mobNumber;
	
	static {
		
		
		System.out.println("I am in the static block ryt now....");
	}
	
	
	public Staticblock(String name, String id, String mobNumber) {
		super();//first line of ctor eather super or this.
		
		System.out.println("Staticblock.Staticblock(String name, String id, String mobNumber)...");
		this.name = name;
		this.id = id;
		this.mobNumber = mobNumber;
	}
}
