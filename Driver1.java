package com.vivek.loop6;

public class Driver1 {

	public static void main(String[] args) {

		int number[] = { 33, -29, 35, -49, 4, -26, 6, 23, -46, 22, -47, 5, 40, -44, -30, 18, -37, -40, 22, -31, -13, -9,
				-11, 44, -23 };
		
		//multiply +ve number by 10
		int n=number.length;
		for(int i=0;i<n;i++) {
			int currentNum=number[i];
			
			if(currentNum<0) {
				continue;//it is use for Skip the current ittration...
			}
			System.out.println(currentNum*10);
		}
	}

}
