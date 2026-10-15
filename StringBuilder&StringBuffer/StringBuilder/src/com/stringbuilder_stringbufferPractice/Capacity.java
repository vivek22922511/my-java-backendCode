package com.stringbuilder_stringbufferPractice;

public class Capacity {

	public static void main(String[] args) {
		
		StringBuffer sb= new StringBuffer("vivek");
		
		System.out.println(sb.length());//5
		
		System.out.println(sb.capacity());//21
		
		
		
		//what happned when we append more words
		
//		sb.append("rajputttttttttttt");
//		
//        System.out.println(sb.length());//22
//		
//		System.out.println(sb.capacity());//44
//		
//		
		
		
		
		//new capacity=(old capacity*2)+2
		
		StringBuffer sb1= new StringBuffer(5);
		
		System.out.println(sb1.capacity());

		sb1.append("HelloWorld");

		System.out.println(sb1.capacity());
		
	}
	
}
