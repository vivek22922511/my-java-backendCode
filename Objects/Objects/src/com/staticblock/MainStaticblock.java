package com.staticblock;

public class MainStaticblock {

	public static void main(String[] args) {
		
		System.out.println("before object creation....");
		
		Staticblock sb=new Staticblock("vivek","viv001","8954907847");
		
		System.out.println("after creation the block...");
			System.out.println(sb.id+" "+sb.name+" "+sb.mobNumber);
		
	}

}
