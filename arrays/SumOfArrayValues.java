package com.arrays;

import java.util.Scanner;

public class SumOfArrayValues {

	public static void main(String[] args) {
		
		int arr[]=new int [5];
		int sum=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the value in array....!");
		
		for(int i=0;i<=arr.length-1;i++) {
			
			arr[i]=sc.nextInt();
		}
		
		for(int i:arr) {
			
			sum=sum+i;
			
		}
		System.out.println("Total Sum of your Array.."+sum);
	}

}
