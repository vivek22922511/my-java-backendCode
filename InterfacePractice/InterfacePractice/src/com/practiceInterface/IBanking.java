package com.practiceInterface;


/*.............this is java 7 or before  interface..................
 * 
 * 100 % contract based
 * all the method abstract by default
 *     public  abstract void payment();
 *                      void stopPayment();
 *           
 * we can not create object  of interface.. 
 * there is no constructor at all...
 * in interface abstract and constant are allowed.
 * declare a constant ----public static final int MAX=100;       
 * */




public interface IBanking 
{
	public static final int MAX=100;//constant 
	
  public  abstract void payment();
  abstract void stopCheque();
  public void suspendPayment();
  void stopPayment();//by default [public abstract] is there
}
