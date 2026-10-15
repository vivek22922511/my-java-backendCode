package com.instanceblock;

public class User {
String userId;
String userName;
String type;

public static int liveUserCount=0;


public User(String userId, String userName, String type) {
	super();
	this.userId = userId;
	this.userName = userName;
	this.type = type;
}


public User(String userName, String type) {
	super();
	this.userName = userName;
	this.type = type;
}

public User() {
	
	
}

{
	//this is IIB .....
	
	liveUserCount=liveUserCount+1;
}



	
}
