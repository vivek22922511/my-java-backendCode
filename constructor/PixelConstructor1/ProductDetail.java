package com.PixelConstructor1;

public class ProductDetail {
	
	String productName;
	double price;
	String description;
	int quantity;
	
	public ProductDetail(String _productName,double _price,String _description,int _quantity) {
		System.out.println("First Scennario");
		this.productName=_productName;
		this.price=_price;
		this.description=_description;
		this.quantity=_quantity;
	}
	
	public ProductDetail(String _productName,String _description) {
		System.out.println("Second Scennario");
		this.productName=_productName;
		this.description=_description;
		
		
	}
	public ProductDetail() {
		
		System.out.println("Third Scennario");
		
	}

}
