package com.oops.inheritance1;

public class Product {

	String productName;
	String description;
	int quantity;
	String status;
	/**
	 * @param productName
	 * @param description
	 * @param quantity
	 * @param status
	 */
	
	public Product(String productName, String description, int quantity, String status) {
		super();
		this.productName = productName;
		this.description = description;
		this.quantity = quantity;
		this.status = status;
	}
	
	public void viewProductDetail() {
		
		
		System.out.println(productName);
		System.out.println(description);
		System.out.println(quantity);
		System.out.println(status);
	}
	
	
}
