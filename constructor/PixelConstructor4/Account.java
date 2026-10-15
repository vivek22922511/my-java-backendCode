package com.PixelConstructor4;

public class Account {
	int aId;
	int aNumber;
	int aBalance;
	Account(int aId,int aNumber,int aBalance){
		
		this.aId = aId;
		this.aNumber=aNumber;
		this.aBalance= aBalance;
	}
}
class User extends Account{
	
	String uName;
	int uId;
	String uLastName;
	
	User(String uName,int uId,String uLastName,int aId,int aNumber,int aBalance){
		super(aId,aNumber,aBalance);
		this.uName=uName;
		this.uLastName = uLastName;
		this.uId = uId;
	}
	void printDetails() {
		System.out.println(this.aId+" " +this.aNumber+ " " + this.aBalance + " " + this.uId + " " + this.uName + " " + this.uLastName);
	}
}
