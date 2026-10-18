package com.stream_api_practice;

import java.util.Arrays;
import java.util.List;

public class SortTheList {

	public static void main(String[] args) {
		
		List<Integer>number=Arrays.asList(1,12,13,23,12,1,2,3,5,4,2,5);
		
		number.stream()
		.sorted()
		.forEach(System.out::println);

	}

}
