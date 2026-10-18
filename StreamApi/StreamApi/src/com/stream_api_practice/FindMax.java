/**
 * 
 */
package com.stream_api_practice;

import java.util.Arrays;
import java.util.List;

/**
 * 
 */
public class FindMax {

	public static void main(String[] args) {
		List<Integer>number=Arrays.asList(48,36,46,18,23,65,93,45);
		
		int max=number.stream()
		.max(Integer::compareTo)//  Integer::compareTo to compare two integers
		
		.orElseThrow();// orElseThrow() returns the result or throws an exception if the stream is empty.
		
		System.out.println(max);

		
		//same for find minimun value. 
	}

}
