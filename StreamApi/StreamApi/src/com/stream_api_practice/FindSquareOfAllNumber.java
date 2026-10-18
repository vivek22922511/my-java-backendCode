package com.stream_api_practice;

import java.util.Arrays;
import java.util.List;

public final class FindSquareOfAllNumber {

	public static void main(String[] args) {


		List<Integer>numbers=Arrays.asList(1,2,3,4,5);
		
		numbers.stream()
		       .map(n-> n*n)//transforms every element
		
		       .forEach(n->System.out.println(n));//second option for printing result..
		
	}

}
