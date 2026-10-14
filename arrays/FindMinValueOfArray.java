package com.arrays01;

public class FindMinValueOfArray {

	public static void main(String[] args) {	
		int arr[]= {22,4,3,6,5,7};
		
		int min=arr[0];
		for(int i=0;i<=arr.length-1;i++) {
			
			if(min>arr[i]) {
				
				min=arr[i];
			}
		}
		System.out.println(min);
	}
}
