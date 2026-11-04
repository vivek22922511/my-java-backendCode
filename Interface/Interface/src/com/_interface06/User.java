package com._interface06;

public class User implements Cleanable {
	
	String name;
	String id;
	/**
	 * @param name
	 * @param id
	 */
	public User(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}

}
