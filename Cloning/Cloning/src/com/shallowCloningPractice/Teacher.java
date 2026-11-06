package com.shallowCloningPractice;

import com.deepCloning.Employeee;

public class Teacher  implements Cloneable{
	
	String name;
	String mobNo;
	Lectures lectures;
	/**
	 * @param name
	 * @param mobNo
	 * @param lectures
	 */
	public Teacher(String name, String mobNo, Lectures lectures) {
		super();
		this.name = name;
		this.mobNo = mobNo;
		this.lectures = lectures;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobNo() {
		return mobNo;
	}
	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}
	public Lectures getLectures() {
		return lectures;
	}
	public void setLectures(Lectures lectures) {
		this.lectures = lectures;
	}
	
	public Object clone() throws CloneNotSupportedException {

		
		Teacher t=(Teacher) super.clone();
		
		t.lectures=(Lectures) lectures.clone();
		
		return t;
	}
	

}
