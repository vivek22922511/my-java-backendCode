package com.instanceblock;

class InstanceMgmt{
	public InstanceMgmt () {
		System.out.println("InstanceMgmt.InstanceMgmt()....");
		
	}
}
public class InstanceBlock extends InstanceMgmt {

	String number;
	
	{
		//initilization block..--> this will get execute whenever object is created>>>
	
		System.out.println("InstanceBlock IIB");
	}
	
	
	
	public InstanceBlock(String number) {
		super();
		//2nd line... call to the initilization block..IIB
		
		System.out.println("InstanceBlock.InstanceBlock(String number....)");
		
		this.number=number;
	}
}
