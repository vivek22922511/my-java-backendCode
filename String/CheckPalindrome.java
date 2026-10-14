package com.StringPractice01;

import java.util.Scanner;

public class CheckPalindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name whatever you want to check?");
		String s=sc.nextLine();
		
		boolean palindrome=true;
		
		int n=s.length();
		for(int i=0,j=n-1;i<j;i++,j--) {
			
			if(s.charAt(i)!=s.charAt(j)) {
				palindrome =false;
				break;
			}
		}
		
		System.out.println(palindrome ? "palindrome": "Not palindrome");

	}

}
