package com.PixelConstructorProject;

public class FoodDeliveryApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Restaurent restaurant = new Restaurent(
		            101,
		            "Pizza House",
		            "Bengaluru",
		            4,
		            true
		        );

		        FoodItem food = new FoodItem(
		            501,
		            "Margherita Pizza",
		            250,
		            "Pizza",
		            10
		        );

		        Order order = new Order(
		            1001,
		            "Vaidik",
		            restaurant,
		            food,
		            2,
		            "Pending"
		        );
		        order.placeOrder();
	}

}
