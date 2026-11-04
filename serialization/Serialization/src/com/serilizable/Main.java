package com.serilizable;

import java.io.IOException;

public class Main {
public static void main(String[] args) throws IOException {
	MessageSerialization messageSerialization=new MessageSerialization();
	
	Message message=new Message("this is tab of  dipmaniflix ", "650mg");
	messageSerialization.serializeMsg(message);
}
}
