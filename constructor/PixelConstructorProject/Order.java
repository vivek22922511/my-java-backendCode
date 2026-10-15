package com.PixelConstructorProject;

//package com.mackinsey.practice1;

public class Order {
	private int orderId;
	private String customerName;
	
	private Restaurent restaurant;
	private FoodItem fooditem;
	
	private int userQuantity;
	private String orderStatus;
	
	Order(int orderId,String customerName,Restaurent restaurant,FoodItem fooditem,int userQuantity,String orderStatus){
		
		this.orderId = orderId;//initializing the instance variable of the current class 
		this.customerName = customerName;//initializing the instance variable of the current class 
		this.restaurant = restaurant;//storing the reference not creating the new object of the restaturant 
		this.fooditem = fooditem;//storing the reference not creating the new object of the fooditem
		this.userQuantity = userQuantity;//initializing the instance variable of the current class 
		this.orderStatus = orderStatus;//initializing the instance variable of the current class 
	}
	
	Order(){
		
	}
	
	public boolean getRestaurantOpenOrClosed()
	{
		if(this.restaurant.getIsRestaurantOpen()) {
			return true;
		}
		return false;
	}
	
	public boolean getFoodAvailableOrNot() {
		if(this.fooditem.getQuantity()>=this.userQuantity) {
			return true;
			
		}return false;
	}
	
	public int getTotalPrice() {
		int resutlTotal = this.userQuantity * this.fooditem.getPrice();
		return resutlTotal;
	}
	
	public void placeOrder() {
		if(getRestaurantOpenOrClosed()) {
			if(getFoodAvailableOrNot()) {
				int totalPay = this.getTotalPrice();
				this.orderStatus = "Placed";
				System.out.println(totalPay);
				System.out.println("Order Placed");
			}else {
				System.out.println("food is not available");
			}
		}else {
			System.out.println("restatuant is closed");
		}
	}
	
}

