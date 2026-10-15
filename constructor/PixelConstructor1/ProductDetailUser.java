package com.PixelConstructor1;

public class ProductDetailUser {

	public static void main(String[] args) {
		
		 ProductDetail user1=new  ProductDetail("oppo",25000.00,"8gb/512gb",100);
		 System.out.println("["+user1.productName+"],["+user1.price+"] ,["+user1.description+"],[ "+user1.quantity+"]");

		 
		 
		 ProductDetail user2=new  ProductDetail("iPhone","8gb/512gb");
		 System.out.println("["+user1.productName+"] ["+user1.description+"]");

		 
		 
		 ProductDetail user3=new  ProductDetail();
		 System.out.println(".....");

	}

}
