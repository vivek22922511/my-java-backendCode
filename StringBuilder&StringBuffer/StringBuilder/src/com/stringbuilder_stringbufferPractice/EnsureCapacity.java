package com.stringbuilder_stringbufferPractice;

public class EnsureCapacity {

	public static void main(String[] args) {
		
		StringBuilder sb =new StringBuilder();
		System.out.println(sb.capacity());
		
		//it increase the initial capacity
		sb.ensureCapacity(50);
		System.out.println(sb.capacity());
	}
	
}
