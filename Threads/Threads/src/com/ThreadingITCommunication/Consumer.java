package com.ThreadingITCommunication;

public class Consumer extends Thread {
Task task;

	
	public Consumer(Task task) {
		super();
		this.task = task;
	}
	
	@Override
	public void run() {
		
		for(int i=0;i<10;i++) {
			
		try {
			Thread.sleep(500);
			task.consume();
			
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}
  }
}
