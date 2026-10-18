package com.StringPractice02;

public class VowelConsonantCount {

	public static void main(String[] args) {
		
		
		String s="vivek";
		
		int vowel=0;
		int consonant=0;
		
		s=s.toLowerCase();
		for(int i=0;i<s.length();i++) {
			
			char ch=s.charAt(i);
			
			if(ch>='a'&&ch<='z') {
				if("aeiou".indexOf(ch)!=-1) {
					vowel++;
				}else {
					consonant++;
				}
			}
		}
		
		System.out.println("vowels--->"+vowel);
		System.out.println("Consonant-->"+consonant);

	}

}
