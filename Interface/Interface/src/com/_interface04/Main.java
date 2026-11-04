package com._interface04;
/*
 * Lanbda exprection.......
 * */

public class Main {
public static void main(String[] args) {
	
	IAccount01 account=() ->
	{
		System.out.println("....Opening account ....");
	};
	account.openAccount();
}
}
