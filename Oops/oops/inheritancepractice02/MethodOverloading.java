package com.oops.inheritancepractice02;


class Calculater{
	
	int num1;
	int num2;
	public Calculater(int num1,int num2) {
		
		this.num1=num1;
		this.num2=num2;
	}
	
	int getsum() {
		int result=num1+num2;
		return result;
	}
}

class AdvanceCalculater extends Calculater{
     
	float num3;
	
	public AdvanceCalculater(int num1, int num2, float num3) {
		super(num1, num2);
		this.num3 = num3;
	}
	
	float getsum(int num1,int num2,float num3) {
		float result=num1+num2+num3;
		return result;
 }

}
public class MethodOverloading {

	public static void main(String[] args) {
		
//		
//		Calculater c=new Calculater(10, 20);
//		System.out.println(c.getsum());
		
	
		AdvanceCalculater c1=new AdvanceCalculater(3, 30,20);
		System.out.println(c1.getsum());
	
		
	
	}
}
