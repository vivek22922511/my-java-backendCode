package com.PixelConstructor6;

public class Electronic extends Product {
	int guarantee;
	public Electronic(String _name, int _price, String _productId,int _guarantee) {
		
		super(_name,_price, _productId);
		this.guarantee=_guarantee;
		
	}
	
	
}
