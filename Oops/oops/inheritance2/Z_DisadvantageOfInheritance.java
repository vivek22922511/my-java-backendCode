package com.oops.inheritance2;

//tightly coupled is the one disadvantage of inheritance
//now using @Override its solved


class Account {
	
	void openAccount(String userId,String email) {
		
		System.out.println("Open account()........");
	}
}


class SavingAccount extends Account{
@Override	
void openAccount(String userId,String email) {
		
		System.out.println("Open SavingAccount()........");
	}
}

class SeniorCitzAccount extends SavingAccount{
@Override	
void openAccount(String userId,String email) {
		
		System.out.println("Open SeniorCitzAccount()........");
	}
}


class PensionAccount extends SeniorCitzAccount{
@Override
void openAccount(String userId,String email) {
		
		System.out.println("Open PensionAccount()........");
		
		System.out.println("UserId-> "+userId+" Email_Id-> "+email);
	}
}




public class Z_DisadvantageOfInheritance {

	public static void main(String[] args) {
		
		
		PensionAccount pa=new PensionAccount();
		
		pa.openAccount("0001", "viv@gmail.com");

	}

}
