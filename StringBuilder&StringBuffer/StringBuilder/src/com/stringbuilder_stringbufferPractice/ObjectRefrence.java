package com.stringbuilder_stringbufferPractice;

public class ObjectRefrence {

	
	public static void main(String[] args) {
		
		StringBuilder sb= new StringBuilder("hello");
		
		StringBuilder sb1=sb;
		
		sb1.append("vivek");
		
		System.out.println(sb);
		
		System.out.println(sb1);
	}
}
