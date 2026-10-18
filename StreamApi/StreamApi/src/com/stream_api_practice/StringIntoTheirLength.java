package com.stream_api_practice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class StringIntoTheirLength {

	public static void main(String[] args) {
		
		List<String>names=Arrays.asList("vivek","shirin","shivi");
		
		names.stream()
		.map(String::length)
		.forEach(n->System.out.println(n));

	}

}
