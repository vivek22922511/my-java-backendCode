package com.PixelConstructor1;

public class HdfcBank {
	
	String accountNum;
	String accHolderName;
	static String intrestRate="8%";
	String status;
	double amount;
	
	 public HdfcBank(String _accountNum,String _accHolderName,String _status,double _amount) {
		 
		       this.accountNum=_accountNum;
		       this.accHolderName=_accHolderName;
		      // this.intrestRate=_intrestRate;
		       this.status=_status;
		       this.amount=_amount;
	 }
	

}
