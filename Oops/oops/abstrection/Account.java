package com.oops.abstrection;

public class Account {

	// to achive abstraction we need to private our core functionalities and expose required methods.
	
	public boolean openAccount(String name ,String address,String pan) {
		
		connectWithDB();
		validateNameAndAddress(name, address);
		validatePan(pan);
		createUserID();
		notifyUser();
		
		return true;
		
		
	}
	//core functionalities...
	private boolean validateNameAndAddress(String name,String address) {
		
		System.out.println("Account.validateNameAndAddress()....validating");
		
		return true;
	}
	
	
	private boolean validatePan(String pan) {
		
		System.out.println("Account.validatePan().... validating pan");
		return true;
	}
	
	private void connectWithDB() {
		System.out.println("Account.connectWithDB()... connecting with DB...");
	}
	
	private String createUserID() {
	System.out.println("Account.createUserID()... creating userId ..");
	return "user id...";
	}
	
	
	private void notifyUser() {
		
		System.out.println("Account.notifyUser()...notifieing to user..");
	}
}
