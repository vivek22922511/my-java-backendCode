package com.serilizablePractice;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Driver_Information {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileInputStream fio=new FileInputStream("D:\\New-Kodewala\\Serialization\\GunSerialization.txt");
		
		ObjectInputStream ois=new ObjectInputStream(fio);
		
		Information	information =(Information)ois.readObject();

		System.out.println("Buy Three Get One Free  price only :7400per: gun_Id: "+information.gunId+" name:"+information.getGunName());
	}
}
