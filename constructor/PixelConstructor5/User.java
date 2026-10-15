package com.PixelConstructor5;

public class User {
	
	String name;
	String type;
	String number;
	String email;
	
	User(String _name,String _type,String _number,String _email){
		this.name=_name;
		this.type=_type;
		this.number=_number;
		this.email=_email;
	}
	 public User(){
		
		this("viv","ggcyg","4567","ABCD@gmail.com");
	}

}
