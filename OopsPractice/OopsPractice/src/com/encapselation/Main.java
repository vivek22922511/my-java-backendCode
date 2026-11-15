package com.encapselation;
/*
 * Encapselation use for data hiding means 
 * make the data private because 
 * we should not give permition to other class to modify our data directly.
 * if they wanted to modify thery came through proper chanel. 
 * 
 * make the data private and use public getter and setter method for updating.
 *   
 *   
 *   
 * */
public class Main {
public static void main(String[] args) {
	
	
	Account acc=new Account("vivek", "22922511", 1000);
	
	//System.out.println("Before updating your current balance is-:"+acc.balance);// Before updating your current balance is-:1000
	
	//acc.balance=2000;
	
	//System.out.println("After updating your balance become-:"+acc.balance);//after updating your balance become-:2000
	/*
	 * this class directly updating  balance 
	 * this is not gud way so
	 * we will encapsulate our account class by using private data members and
	 *  public setter and getter method*/
	
	
	
	System.out.println("Balance is-:"+acc.getBalance());
	System.out.println("Account number is-:"+acc.getAccountNo());
	System.out.println("Your name  is-:"+acc.getName());

	/*Balance is-:1000
	 * Account number is-:22922511
	 * Your name  is-:vivek
	 *
	 * */
	acc.doCredit(200);
	System.out.println("your current balance is-:"+acc.getBalance());//your current balance is-:1200
}
}
