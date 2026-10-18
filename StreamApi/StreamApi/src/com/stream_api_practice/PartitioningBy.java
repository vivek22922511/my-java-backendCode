package com.stream_api_practice;

import java.util.*;
import java.util.stream.*;

public class PartitioningBy {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

		Map<Boolean, List<Integer>> result = numbers.stream()
				.collect(Collectors.partitioningBy
				(n -> n % 2 == 0));

		System.out.println("Even: " + result.get(true));
		System.out.println("Odd: " + result.get(false));
	}

}
