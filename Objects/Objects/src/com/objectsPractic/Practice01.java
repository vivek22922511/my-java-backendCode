package com.objectsPractic;

public class Practice01 {
	
	static  {
		System.out.println("A");
	}
	
	static{
		System.out.println("B");
		
	}
	
	{
		System.out.println("C");
		
	}
	{
		System.out.println("D");
		
	}
	Practice01(){
		System.out.println("E");
	}
	
	
	
	
public static void main(String[] args) {
	Practice01 p=new Practice01();
	
}
}
