package com.ThreadingITCommunication;

public class Driver {
public static void main(String[] args) {
	
	Task task=new Task();
	
	Producer producer=new Producer(task);
	Consumer consumer=new Consumer(task);
	
    producer.setName("producer");
    consumer.setName("consumer");
	
	producer.start();
	consumer.start();
	
}
}
