package com.StringPractice02;

public class CountOccurrenceOfCharacter {

	public static void main(String[] args) {


		String s="Civilization";
		char target='i';
		int count=0;
		
		
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i)==target) {
				count++;
			}
		}
		System.out.println(count);
		
	}

}
