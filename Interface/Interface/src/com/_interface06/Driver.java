package com._interface06;

public class Driver {
	public static void main(String[] args) {
		
		
		User user=new User("vivek rajput","vk001");
		DataCleaner cleaner=new DataCleaner();
		
		cleaner.clean(user);
	}

}
