package com.deepCloning;

public class Employeee implements Cloneable{
	
	String name;
	String id;
	Addresss address;
	/**
	 * @param name
	 * @param id
	 * @param address
	 */
	public Employeee(String name, String id, Addresss address) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		
		Employeee e=(Employeee) super.clone();
		e.address=(Addresss) address.clone();
		return e;
		
	}

}
