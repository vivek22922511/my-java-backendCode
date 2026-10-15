package com.PixelConstructor;

public class Driver {
	
	int employeeId;
	String employeeName;


	
	Driver(int employeeId,String employeeName){
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		
	}
	public static void main(String[] args) {
	
	Driver d1=new Driver(001,"rajput");
	System.out.println(d1.employeeName);
	}

}
