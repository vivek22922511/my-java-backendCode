package com.PixelConstructor2;

public class PaymentDriver {

	public static void main(String[] args) {
		PaymentService  paymentService=new PaymentService ();
		
		
		paymentService.doPayment("upi");
		paymentService.doPayment("card ");
		paymentService.doPayment("cash");

	}

}
