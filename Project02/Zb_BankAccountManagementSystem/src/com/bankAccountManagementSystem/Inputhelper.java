package com.bankAccountManagementSystem;

import java.util.Scanner;

public class Inputhelper {

	private Scanner sc= new Scanner(System.in);
	
	public int readInt(String message) {
		while(true) {
			
			System.out.println(message);
			String input=sc.nextLine();
			
			try {
				return Integer.parseInt(input.trim());
			}
			catch(NumberFormatException e) {
			System.out.println("Invalid input .. Please enter a whole number.");	
			}
		}
	}
	public double readDouble(String message) {
		while(true) {
			System.out.println(message);
			String input =sc.nextLine();
			
			
			try {
				return Double.parseDouble(input.trim());
			}
			catch(NumberFormatException e) {
				System.out.println("Input invalid .. Please entere a valid amount ");
			}
		}
	}
	public String readString (String message) {
		System.out.println(message);
		return sc.nextLine().trim();
	}
}
