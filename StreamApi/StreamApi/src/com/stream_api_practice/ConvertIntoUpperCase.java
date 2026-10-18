package com.stream_api_practice;

import java.util.Arrays;
import java.util.List;

public class ConvertIntoUpperCase {

	public static void main(String[] args) {
		
		List<String>names=Arrays.asList("vivek","shirin","rida");
		
		names.stream()
		.map(String::toUpperCase)
		.forEach(System.out::println);

	}

}
