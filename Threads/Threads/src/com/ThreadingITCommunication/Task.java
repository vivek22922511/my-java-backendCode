package com.ThreadingITCommunication;

public class Task
{

	int data;
	 boolean isDataAvailable=false;
	 
	 //produce
	 
	 public synchronized void produce(int _data) throws InterruptedException {
		 
		 while(isDataAvailable) {
			 
			 System.out.println("["+Thread.currentThread().getName()+"] is waiting..");
			 
			 wait();
		 }
		 
		 //producer the data
		 
		 this.data=_data;
		 System.out.println("produce the data:"+data);
		 isDataAvailable=true;
		 System.out.println("producer notifying the cunsumer:");
		 notify();//notify the consumer so that consumer can consume it .
	 }
	 
	 //Consume
	 public synchronized void consume() throws InterruptedException {
		 
		 while(!isDataAvailable) {
			 wait();
			 
		 }
		 System.out.println("consuming the data:"+data);
		 isDataAvailable=false;
		 System.out.println("consumer notifying the producer:");
		 notify();//notify the producer so that producer can generate/produce more data.
	 } 
}
