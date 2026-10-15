package com.stringbuilder_stringbufferPractice;

public class DeleteMethod {

	
	public static void main(String[] args) {
		
		
		StringBuilder sb=new StringBuilder("vivek1234");
		
		System.out.println(sb);
		
		
		sb.delete(5, sb.length());
		System.out.println(sb);
		
		
		sb.delete(2, 9);
		System.out.println(sb);
		
		
		
	}
}
