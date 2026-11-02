package com.oops.polymorphism;


class User{
	
	
}

class AdminUser extends User{
	
	
}

class FinanceUser extends AdminUser{
	
}

public class Upcasting_Downcasting {

	public static void main(String[] args) {
		
		User u1=new User();//user class referring to user class object.
		
		AdminUser au1=new AdminUser();
		
		
		
		
		User au2=(User)new AdminUser();//parent class can refer the child class object---> up- casting.
		
		Object au3=new FinanceUser();
		
		
		AdminUser au=(AdminUser)new User();//child class is referring the parents class object-->> down casting.
	}

}
