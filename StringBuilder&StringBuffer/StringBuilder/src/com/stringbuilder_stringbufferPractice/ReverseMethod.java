package com.stringbuilder_stringbufferPractice;

public class ReverseMethod {
	
	public static void main(String[] args) {
		
		StringBuilder sb=new StringBuilder("vivek");//1706234378
		StringBuilder sb2=new StringBuilder("vivek");//1867750575
		System.out.println(sb);
		
		sb.reverse();
		
		System.out.println(sb);
		System.out.println(sb.hashCode());
		
		System.out.println(sb2.hashCode());
	}

}
