package com.stringbuilder_stringbufferPractice;

public class TrimToSizeMethod {
//it will reduse the capacity equal to length..
	
	public static void main(String[] args) {
		
		StringBuilder sb=new StringBuilder("vivek");
		
		System.out.println(sb.length());//5
		System.out.println(sb.capacity());//21
		
		
		sb.trimToSize();
		
		System.err.println(sb.capacity());//5
		
		
		
	}
}
