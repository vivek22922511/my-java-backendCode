package com.stream_api_practice;

import java.util.Arrays;
import java.util.List;

public class NameStartWith {

	public static void main(String[] args) {


		List<String>names=Arrays.asList("vivek","shirin","shivii","shivani","rida","sachin","annu","vikku");
		
		names.stream()
		.filter(n-> n.startsWith("v"))
		.forEach(n->System.out.println(n));

	}

}
