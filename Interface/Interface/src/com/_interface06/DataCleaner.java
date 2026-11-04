package com._interface06;


public class DataCleaner implements  Cleanable {

	public void clean(Object obj) {
		
		if(obj instanceof  Cleanable) {
			 System.out.println("Allowed to clean....");
		}else {
			System.err.println("Not Allowed!");
		}
	}



}
