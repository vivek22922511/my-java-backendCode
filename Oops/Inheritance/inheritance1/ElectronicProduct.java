package com.oops.inheritance1;

public class ElectronicProduct extends Product{
	
	
	boolean isWarranty;
	int warrantyInYear;
	/**
	 * @param productName
	 * @param description
	 * @param quantity
	 * @param status
	 * @param iaWarranty
	 * @param warrantyInYear
	 */
	public ElectronicProduct(String productName, String description, int quantity, String status, boolean isWarranty,
			int warrantyInYear)
	{
		
		super(productName, description, quantity, status);
		this.isWarranty = isWarranty;
		this.warrantyInYear = warrantyInYear;
		
		
	}
	
	public void showElectronicProductDetail(){
		
		System.out.println(productName);
		System.out.println(description);
		System.out.println(quantity);
		System.out.println(status);
		System.out.println(isWarranty);
		System.out.println(warrantyInYear);
		
	}
	
	

}
