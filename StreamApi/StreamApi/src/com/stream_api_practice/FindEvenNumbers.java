package com.stream_api_practice;

import java.util.Arrays;
import java.util.List;

public class FindEvenNumbers {

	public static void main(String[] args) {
		
		List<Integer>number=Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		number.stream()//list convert into stream.
		
		.filter(n->n%2==0)// logic to find even number.
		
		.forEach(System.out::println);//for printing the result...
		
	}

}
