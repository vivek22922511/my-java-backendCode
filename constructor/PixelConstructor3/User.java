package com.PixelConstructor3;

class SuperUser {
	
}
public class User extends SuperUser
{
	String userName;
	String userId;
	String mobile;
	
	User(String _userName,String _userId,String _mobile)
	{
		this(46);
  		this.userId=_userId;
		this.userName=_userName;
		this.mobile=_mobile;
	}
	User(int x){
		System.out.println("hello");
	}
	
	
	
}
