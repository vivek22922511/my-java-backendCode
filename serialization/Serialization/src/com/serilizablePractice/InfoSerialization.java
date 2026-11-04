package com.serilizablePractice;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class InfoSerialization {

	public void gunInfo(Information info) throws IOException {
		
		FileOutputStream fio=new FileOutputStream("gunSerialization.txt");
		
		ObjectOutputStream oos=new ObjectOutputStream(fio);
		
		oos.writeObject(info);
		oos.close();
		
	}
}
