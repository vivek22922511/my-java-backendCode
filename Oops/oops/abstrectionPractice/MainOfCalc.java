package com.oops.abstrectionPractice;

public class MainOfCalc {

	public static void main(String[] args) {
		Calc calc=new Calc(2, 3);
		
		calc.doCalculation();

		System.out.println(calc);
	}

}
