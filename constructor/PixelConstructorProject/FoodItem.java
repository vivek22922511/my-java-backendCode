package com.PixelConstructorProject;


class Food {
	private String category;
	private int quantity;
	Food(String category, int quantity) {
		System.out.println("parent class constructor category and quantity started ");
		this.category = category;
		this.quantity = quantity;
		System.out.println("parent class constructor category and quantity ended");
	}
	
	public String getCategory() {
		return this.category;
	}
	public int getQuantity() {
		return this.quantity;
	}
}

public class FoodItem extends Food {
	private int foodId;
	private String foodName;
	private int price;

	FoodItem(int foodId,String foodName,int price,String category,int quantity){
		super(category,quantity);
		System.out.println("the constructor started ");
		this.foodId = foodId;
		this.foodName=foodName;
		this.price=price;
		System.out.println("the constructor ended");
		
	}
    public int getFoodId() {
		return this.foodId;
	}
	public String getFoodName() {
		return this.foodName;
	}
	public int getPrice() {
		return this.price;
	}
}
