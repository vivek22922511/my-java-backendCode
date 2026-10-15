package com.PixelConstructorProject;

public class Restaurent {
	private int restaurantId;
	private String restaurantName;
	private String location;
	private int rating;
	private boolean isRestaurantOpen;

	Restaurent() {
	}

	Restaurent(int restaurantId, String restaurantName, String location, int rating, boolean isRestaurantOpen) {
		this(rating, isRestaurantOpen);
		System.out.println("all args constructor start");
		this.restaurantId = restaurantId;
		this.restaurantName = restaurantName;
		this.location = location;
		System.out.println("all args constructor end");
	}

	Restaurent(int rating, boolean isRestaurantOpen) {
		System.out.println("rating and isrestaturantopen constructor start");
		this.rating = rating;
		this.isRestaurantOpen = isRestaurantOpen;
		System.out.println("rating and isrestaturantopen constructor end");
	}

	public int getrestaurantId() {
		return this.restaurantId;
	}

	public String getrestaurantName() {
		return this.restaurantName;
	}

	public String getloaction() {
		return this.location;
	}

	public int getrating() {
		return this.rating;
	}

	public boolean getIsRestaurantOpen() {
		return this.isRestaurantOpen;
	}

}
