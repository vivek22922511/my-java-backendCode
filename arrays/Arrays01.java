package com.arrays;

import java.util.Scanner;

public class Arrays01 {

	public static void main(String[] args) {
		
		///first way to insert value in array
		
		int arr[]= {1,2,3,4,5};
		
		
		///2nd way to insert value in array
		
	//	int arr[]=new int[5];
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the value in array..!");
//		
//		for(int i=0;i<arr.length;i++) {
//			arr[i]=sc.nextInt();
//		}
//		
		
		
		
		System.out.println("These are the value of your array..!");
		
		for(int i:arr) {
			System.out.println(i);
		}

	}

}
