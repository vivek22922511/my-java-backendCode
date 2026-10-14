package com.vivek.scan;

import java.util.Scanner;

public class Driver1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int price=0;
		System.out.println("enter the price");

		if (sc.hasNextInt()) {
			price = sc.nextInt();

		} else {
			System.out.println("please enter the price in a valid type..");
		}
		
		System.out.println("price:" + price);
		sc.close();
	}

}
