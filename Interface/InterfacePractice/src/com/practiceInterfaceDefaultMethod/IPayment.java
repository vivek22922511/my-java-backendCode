package com.practiceInterfaceDefaultMethod;

public interface IPayment {
 void pay();
 void status();
 /*in java 8 they introduce default method with body
  * this is optional whoever want to override can override
  * if you will not override it will not break your existing class
  * */
 public default void checkBalance() {
	 System.out.println("IPayment.checkBalance()");
 }
 
 
 
 
 //from java 8 onwards, you can write static method inside interface. 
 /*
  * now another problem come that we remove the code duplicesy 
  * from class after making static method  but
  * what if we have same 50 line code in the both static methods
  * new peoblem came code duplicesy within the interface
  * now  java 9 onward they introduce Private method to solve this problem.
  * 
  * purpose of static -->remove duplicesy between the classes.
  * purpose of private-->remove duplicesy within the interface.
  * 
  * */
 public static int calculationTxnFees(int amount,int txnPercentage) {
	       connectToDB();
	 int txnFee=amount * txnPercentage/100;
	 return txnFee;
 }
 
 public static int calculationConFees(int amount,int txnPercentage,String type) {
	 connectToDB();
	 int txnFee=amount * txnPercentage/100;
	 return txnFee;
 }
 
 
 //in java 9 they launch this method
 
 private static void connectToDB() {
	 
	//20 line of code--> database connection logic
	 System.out.println("IPayment.connectToDB()..");
 }
 
}
