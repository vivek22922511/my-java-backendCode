package com.ThreadingExecutorService;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyThread extends Thread{
	
	int taskId;
	
	@Override
	public void run() {
		
		System.out.println("MyThread.run()... task is "+taskId+": ["+Thread.currentThread().getName()+"] ");
		
		
	}
	
	public MyThread(int taskId) {
		
		this.taskId=taskId;
	}
	
}
public class Driver {

	public static void main(String[] args) {
		
		//we are going to use executor service.
		
		ExecutorService executorService=Executors.newFixedThreadPool(5);
		
		//executing 10 task
		for(int i=0;i<10;i++) {
			MyThread task=new MyThread(i);
			executorService.execute(task);
		}
		executorService.shutdown();
	}
}
