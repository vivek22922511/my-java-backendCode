package com.oops.polymorphismSOLIDprinciple_OCP;

public class Delivery {
	public void doDelivery() {
		System.out.println("Delivery.doDelivery().............Delivery");
	}
	public void processorDelivery(Delivery D1) {
		 D1.doDelivery();
	}

}
