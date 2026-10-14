package com.StringPractice01;

public class Reverse {
	public static void main(String[] args) {

		String str = "vivek rajput";
		String reverse = "";

		int n=str.length();
		for (int i = n- 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}

		System.out.println(reverse);
	}

}
