package com.stream_api_practice;

import java.util.Arrays;
import java.util.List;

public class ForEachOperation {

	public static void main(String[] args) {
		
		
		List<Integer>number=Arrays.asList(10,20,30,40);
		
		number.stream()
		
		.forEach(System.out::println);

		
	}

}
