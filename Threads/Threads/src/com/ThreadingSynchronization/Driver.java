package com.ThreadingSynchronization;
/*
 * if we want to access one thread at a time then wee use synchronized
 * 
 * 
 * 
 * what happens if two or more  threads trying to execute ..
 * the same object {it is called (raise)problem we solve this using synchronization.} 
 * then data will be miss calculate ex-(paytm,card,balance) 
 * 
 * 
 * 
 * how synchronization works?
 * -->Based on the object lock.
*Every object gets exactly one object lock.
*If a method is synchronized, then the thread needs an object lock to execute the method.
*If multiple threads are trying to execute a synchronized method at the same time on a shared object, only one thread will get the object lock.
*The thread that gets the object lock will enter and execute the synchronized method.
*While one thread is executing the method, other threads will be in the WAITING state (waiting for the lock).
*Once the thread has executed the synchronized method, it will release the object lock.
*Now another thread will take the object lock and start execution.
 *  
 *  
 *  
 *  What if method is static?
 *  it will called by class name 
 *  */
class  Task{
	public synchronized void printNumbers() {
		   // here synchronized means if first thread got chance
		//to execute then it will execute complete then second will be execute.
		
		
		for(int i=0;i<=10;i++) {
			
			System.out.println("Printing..:"+i+"["+Thread.currentThread().getName()+"]");
		}
	}
}

class  PrintThreads extends Thread{
	
	Task task;
	PrintThreads(Task _task){
		this.task=_task;
	}
	
	public void run() {
		task.printNumbers();
	}
}

public class Driver {
	public static void main(String[] args) {
		
		Task tassk1=new Task();
		PrintThreads t1=new PrintThreads(tassk1);
		t1.setName("first thread");
		t1.start();
		
		PrintThreads t2=new PrintThreads(tassk1);
		t2.setName("2nd thread");
		t2.start();
		
	}

}
