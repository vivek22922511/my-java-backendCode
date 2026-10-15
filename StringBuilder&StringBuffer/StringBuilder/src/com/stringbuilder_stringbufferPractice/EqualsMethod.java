package com.stringbuilder_stringbufferPractice;

public class EqualsMethod {

	public static void main(String[] args) {
		
		StringBuilder sb1 = new StringBuilder("Java");
		StringBuilder sb2 = new StringBuilder("Java");

		System.out.println(sb1 == sb2);//false cuz both are seprate obj..
		
		System.out.println(sb1.equals(sb2));//false cuz .equals method is not override in stringbuilder..
		
		
		
		//to compare the text
		
		System.out.println(sb1.toString().equals(sb2.toString()));//true
	}
}
