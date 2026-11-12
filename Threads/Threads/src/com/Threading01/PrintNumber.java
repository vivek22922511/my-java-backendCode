package com.Threading01;

class PrintNumberTillTwenty extends Thread{
	
	public void run() {
		
		for(int i=1;i<=20;i++) {
			
			System.out.println("Number is "+i+ "  and Thread is "+Thread.currentThread().getName());
		}
	}
}
public class PrintNumber {

	public static void main(String[] args) {
		
		PrintNumberTillTwenty t1=new PrintNumberTillTwenty();
		t1.start();
		
		PrintNumberTillTwenty t2=new PrintNumberTillTwenty();
		t2.start();
	}
}
