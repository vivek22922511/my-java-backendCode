package com._interface01;

public interface IBooking {
	
	public abstract void book();
	public abstract void cancleBooking();
	public abstract void  checkStatus();
	                void search();
	                
	       
	                //java 8 interoduce ..Backword Compatability....(default method)
	                
	                public default void autoUpgrade() {
	                	
	                	System.out.println("IBooking.autoUpgrade()........");
	                }

}
