package com.stream_api_practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHighestNumber {

	public static void main(String[] args) {
		
		
		List<Integer>number=Arrays.asList(10,23,1,2,7,3,2,5,20,30,40,7,3,2,5,50);
		
		int secondHighest=	number.stream()
		.distinct()//remove duplicate values
		.sorted(Comparator.reverseOrder())//sorts largest to smallest
		.skip(1)//skip 50
		.findFirst()//after skip 50 now first will be 40 
		.orElseThrow();//handles the case where no result exists by throwing an exception.
		
		System.out.println(secondHighest);

	}

}
