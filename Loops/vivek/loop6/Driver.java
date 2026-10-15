package com.vivek.loop6;

public class Driver {

	public static void main(String[] args) {

		String[] cities = { "Amsterdam", "Bangkok", "Barcelona", "Berlin", "Cairo", "Cape Town", "Dubai", "Dublin",
				"Istanbul", "London", "Los Angeles", "Berlin", "Melbourne", "Berlin", "Mumbai", "New York", "Paris",
				"Berlin", "Rome", "Berlin", "Singapore", "Sydney", "Tokyo", "Toronto", "Vienna" };
		
		// find the berlin is part of this city list or not..
		int n = cities.length;
		
		for (int i = 0; i < n; i++) {
			
			String currentCity = cities[i];
			
			if (currentCity.equals("Berlin")) {
				
				System.out.println("yes Berlin is the part of the list cities");
				break;// if Berlin found it will break the execution
			}
		}
	}

}
