package com.StringPractice02;

public class CountTheStringWords {

	public static void main(String[] args) {


		String s="Blr is a gud place";
		
		String words[]=s.trim().split(" ");
		
		System.out.println("words-->"+words.length);

	}

}
