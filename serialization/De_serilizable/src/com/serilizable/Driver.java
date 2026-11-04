package com.serilizable;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class Driver {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		
		FileInputStream fis=new FileInputStream("D:\\New-Kodewala\\Serialization\\message.txt");
		
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		Message message=(Message) ois.readObject();	
		
		System.out.println("De Ser: "+message.getName());
	}
}
