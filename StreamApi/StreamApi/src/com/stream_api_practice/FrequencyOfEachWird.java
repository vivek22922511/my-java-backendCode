package com.stream_api_practice;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyOfEachWird {

	public static void main(String[] args) {
		
		List<String>words=Arrays.asList("java", "sql", "java", "html", "sql", "java");
		
		Map<String, Long>result=words.stream()
				.collect(Collectors.groupingBy(
						word->word,
						LinkedHashMap::new,//preserves the order in which the words first appear.
						Collectors.counting()
						));
		System.out.println(result);

	}

}
