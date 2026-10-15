package com.PixelConstructor1;

public class HdfcCustomer {

	public static void main(String[] args) {
		
		
		HdfcBank customer=new HdfcBank("0588001501971685","VIVEK RAJPUT","current",10000);
		
		System.out.println("["+customer.accountNum+"] ["+customer.accHolderName+"] ["+customer.intrestRate+"] ["+customer.status+"] ["+customer.amount+"]");
		
		HdfcBank customer1=new HdfcBank("0588001501971686"," SHIRIN ANSHARI","current",20000);
		
		System.out.println("["+customer1.accountNum+"] ["+customer1.accHolderName+"] ["+customer1.intrestRate+"] ["+customer1.status+"] ["+customer1.amount+"]");
		
		HdfcBank customer2=new HdfcBank("0588001501971687","PAVINDRA RAJPUT","current",30000);
		
		System.out.println("["+customer2.accountNum+"] ["+customer2.accHolderName+"] ["+customer2.intrestRate+"] ["+customer2.status+"] ["+customer2.amount+"]");
		
		HdfcBank customer3=new HdfcBank("0588001501971688","RIDA ANSHARI","current",40000);
		
		System.out.println("["+customer3.accountNum+"] ["+customer3.accHolderName+"] ["+customer3.intrestRate+"] ["+customer3.status+"] ["+customer3.amount+"]");
		
		HdfcBank customer4=new HdfcBank("0588001501971689","NEHA RAJPUT","current",50000);
		
		System.out.println("["+customer4.accountNum+"] ["+customer4.accHolderName+"] ["+customer4.intrestRate+"] ["+customer4.status+"] ["+customer4.amount+"]");
	}

}
