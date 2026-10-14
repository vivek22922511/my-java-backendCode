package com.arrays;

public class FindMaxValueOfArray {

	public static void main(String[] args) {
		int arr[]= {2,3,5,1,2,4};
		int max=0;
		for(int i:arr) {
			
			if(arr[i]>max) {
				
				max=arr[i];
			}
		}
		System.out.println(max);
	}

}
