package com.ThreadingMethods;

class Task{
	public void doSomething() {
		System.out.println("MyThread.doSomething()...["+Thread.currentThread().getName()+"]");
		
		try {
			//TIMED_WAITING.
			Thread.sleep(5000);//current thread will wait for 5 second..
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
	
	/*
	 * 
	 * Difference between wait() and sleep() ?
	 * 
	 * sleep hold the object lock and move to sleep.No matter thread will execute will or not.But
	 * wait does not hold the object lock it release object lock then move to waiting state.
	 * wait must be call from synchronized.
	 * 
	 * */
	
	
	
	
	public  synchronized void doNothing() {
	System.out.println("MyThread.doNothing()...["+Thread.currentThread().getName()+"]");
		
		try {
			
			//TIMED_WAITING.
			Thread.sleep(1000);//hold the object lock and sleep.no matter thread will execute or not.
			
			wait(1000);//move the current thread to waiting state.
			
			
			for(int i=1;i<=10;i++) {
				System.out.println("printing "+i+" ["+Thread.currentThread().getName()+"] ");
				
				Thread.yield();//it gives the time to other thread to execute it is up to thread that  it will tack chance or not.
			}
			
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}
}

class MyThread extends Thread{
	
	Task task;

	
	public MyThread(Task task) {
		super();
		this.task = task;
	}
	
	@Override
	public void run() {
		System.out.println("MyThread.run()..["+Thread.currentThread().getName()+"]");
		
		task.doSomething();
		task.doNothing();
	}

}


public class Driver {
public static void main(String[] args) throws InterruptedException {
	
	System.out.println("Driver.main(). Started...["+Thread.currentThread().getName()+"]");
	Task task=new Task();
	
	
	MyThread t1=new MyThread(task);
	t1.start(); 
	
	MyThread t2=new MyThread(task);
	t2.start();
	
	t1.join();//the current thread will wait for other thread to complete
	
	System.out.println("Driver.main(). Ends ...["+Thread.currentThread().getName()+"]");
}
}
