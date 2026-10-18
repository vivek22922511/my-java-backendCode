package com.stream_api_practice;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicate {

	public static void main(String[] args) {

			
		List<Integer>num=Arrays.asList(1,2,3,2,3,4,5,1,3,6,5);
		
		num.stream()
		.distinct()//distinct removes duplicate...
		.forEach(n-> System.out.println(n));

		
		

	}

}
