package com.stringbuilder_stringbufferPractice;

public class ReplaceMethod {
public static void main(String[] args) {
	
	StringBuilder sb=new StringBuilder("I am vivek kumar. ");
		
	System.out.println(sb);
	sb.replace(11, 16, "rajput");

	System.out.println(sb);
	
}
}
