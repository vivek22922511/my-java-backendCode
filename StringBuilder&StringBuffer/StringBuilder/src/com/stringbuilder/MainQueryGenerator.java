package com.stringbuilder;

public class MainQueryGenerator {

	public static void main(String[] args) {
		
		QueryGenerator generator=new QueryGenerator();
		
		//StringBuilder result=generator.generateQuery(12000, null);
		
		StringBuilder result=generator.generateQuery( 0, "scout001");
		
	System.out.println(result);
	}

}
