package com.stream_api_practice;

import java.util.Arrays;
import java.util.List;

public class Count {

	public static void main(String[] args) {

		List<Integer> numbers =Arrays.asList(5, 12, 15, 8, 20);
		
	long count=	numbers.stream()
			   .filter(n-> n>10)//it is a intermediate operation..
			   .count();//forEach will not work here cuz count is a terminal operation. 
		
		System.out.println(count);
	}

}
