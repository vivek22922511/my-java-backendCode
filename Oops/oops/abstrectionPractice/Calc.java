
package com.oops.abstrectionPractice;

public class Calc {

	int num1;
	int num2;

	public Calc(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public void doCalculation() {
		System.out.println("Addition: " + add(num1, num2));
		System.out.println("Subtraction: " + sub(num1, num2));
		System.out.println("Multiplication: " + multiply(num1, num2));
	}

	private int add(int num1, int num2) {
		return num1 + num2;
	}

	private int multiply(int num1, int num2) {
		return num1 * num2;
	}

	private int sub(int num1, int num2) {
		return num1 - num2;
	}
}
