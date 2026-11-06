package com.deepCloning;

public class Addresss implements Cloneable {
 
	String state;
	String distric;
	String town;
	/**
	 * @param state
	 * @param distric
	 * @param town
	 */
	public Addresss(String state, String distric, String town) {
		super();
		this.state = state;
		this.distric = distric;
		this.town = town;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
}
