package com.oops.inheritance1;

public class ClothProduct extends Product {

	String type;

	/**
	 * @param productName
	 * @param description
	 * @param quantity
	 * @param status
	 * @param type
	 */
	public ClothProduct(String productName, String description, int quantity, String status, String type) {
		super(productName, description, quantity, status);
		this.type = type;
	}
	
	public void showClothProduct() {
		
		System.out.println(productName);
		System.out.println(description);
		System.out.println(quantity);
		System.out.println(status);
		System.out.println(type);
	}

}
