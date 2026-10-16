package com.oops.inheritance1;

public class MainOfProductAndElectronicProduct {

	public static void main(String[] args) {
		
		ElectronicProduct ep=new ElectronicProduct("Iphone18","pro", 10, "in stock", true, 2);
		
		ep.showElectronicProductDetail();
		
		
		
		ClothProduct cp=new ClothProduct("Shirt", "m-size", 100, "on discount", "winter");
		
				cp.showClothProduct();
	}

}
