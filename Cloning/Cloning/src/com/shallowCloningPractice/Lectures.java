package com.shallowCloningPractice;

public class Lectures implements Cloneable{
	
	String sub01;
	String sub02;
	String sub03;
	/**
	 * @param sub01
	 * @param sub02
	 * @param sub03
	 */
	public Lectures(String sub01, String sub02, String sub03) {
		super();
		this.sub01 = sub01;
		this.sub02 = sub02;
		this.sub03 = sub03;
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	}


