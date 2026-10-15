package com.PixelConstructor2;

public class PaymentService {
	
	    public void doPayment(String _type) {

	        if (_type.equalsIgnoreCase("upi")) {
	            System.out.println("Processing UPI payment");
	            SendCard();	        }
	        else if (_type.equalsIgnoreCase("card")) {
	            System.out.println("Processing Credit Card payment");
	            SendCash();
	        }
	        else if (_type.equalsIgnoreCase("cash")) {
	            System.out.println("Processing PayPal payment");
	            SendCash();
	        }
	        else {
	            System.out.println("Invalid payment type");
	        }
	    }
	    private void SendCard() {
	    	System.out.println("PaymentService.doPayment() Strt");
	    	
	    	
	    	//code
	     	System.out.println("PaymentService.doPayment() ends");
	    }
	    
	    
	    private void SendUPI() {
	    	System.out.println("PaymentService.doPayment() Strt");
	    	
	    	//code
	     	System.out.println("PaymentService.doPayment() ensd");
	    }
	    
	    
	    private void SendCash() {
	    	System.out.println("PaymentService.doPayment() Strt");
	    	
	    	//code
	     	System.out.println("PaymentService.doPayment() ends");
	    }
	    
	    
	    
	}


