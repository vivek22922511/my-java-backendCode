package com.vivek.loop4;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int luckeyNUmber = 11;
		int userEntered = 0;
		while (luckeyNUmber != userEntered) {
			System.out.println("enter  the number");
			userEntered = sc.nextInt();

			if (userEntered == luckeyNUmber) {
				System.out.println("You Won");
			} else {
				System.err.println("please try again");
			}
		}
	}

}
