package com._interface05;

public class Account implements Cloneable {
	String name;
	String address;
	String accNo;
	
	public Account(String name, String address, String accNo) {
		super();
		this.name = name;
		this.address = address;
		this.accNo = accNo;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}

}
