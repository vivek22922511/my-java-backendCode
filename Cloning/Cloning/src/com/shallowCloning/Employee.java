package com.shallowCloning;

public class Employee implements Cloneable {
	
	String empName;//copy
	String empId;//copy
	Address address;//copy the reference
	/**
	 * @param empName
	 * @param empId
	 * @param address
	 */
	public Employee(String empName, String empId, Address address) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.address = address;
	}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
