package com.String02;

public class InternDriver {

	public static void main(String[] args) {
	
		
//		String s1="vivek";
//		
//		String s2="world";
//		String s4=s1+s2;
//		System.out.println(s4);
//		
//		
//		String s7="vivekworld";
//		System.out.println(s7==s4.intern());
		
		
		
		
		
		String s1 = new String("Java");
		String s2 = s1.intern();
		String s3 = "Java";

		System.out.println(s1 == s2);
		System.out.println(s2 == s3);
		
	}

}
