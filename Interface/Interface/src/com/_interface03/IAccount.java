package com._interface03;
/*
 * this interface is functional cuz it has only one abstract method
 * but it can have many default	 other method or
 * 
 *  
 *  if we inherit the other functionalInterface ,it will not more functional interface cuz IAccount both has one- one abstract and IAccountMgmt
 * */
//@FunctionalInterface
public interface IAccount extends IAccountMgmt
{
	void openAccount();//only one abstract method---->> functional interface..(SAM..single abstract method)
	
	default void addBani() {
	System.out.println("IAccount.addBani()");
	}
}
