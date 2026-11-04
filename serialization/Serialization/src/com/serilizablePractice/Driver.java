package com.serilizablePractice;

import java.io.IOException;

public class Driver {
	public static void main(String[] args) throws IOException {
		
		InfoSerialization infoSerialization=new InfoSerialization();
		
		Information information=new Information("VNs_12B","Desi-315");
		
		infoSerialization.gunInfo(information);
		
	}

}
