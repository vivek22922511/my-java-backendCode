package com.Constructor;


class Students{
	int id;
	String name;
	
	 Students(){
		id=001;
		name="vivek";
	}

}

public class NoArgumentCtor {
	public static void main(String[] args) {
		
		Students s=new Students();
		
		System.out.println(s.id+" "+s.name);
	}


}
