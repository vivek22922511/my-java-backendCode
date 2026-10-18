package com.stream_api_practice;

import java.util.Arrays;
import java.util.List;

public class SumOfAllNum {

	public static void main(String[] args) {


		List<Integer>number=Arrays.asList(10,20,30,40);
		
		int sum=number.stream()
		.mapToInt(Integer::intValue)//mapToInt() converts the stream into an IntStream.
		.sum();
		
		System.out.println(sum);

	}

}
