package com.ThreadingUsingRunable01;

/*there are two ways for thread...
 * 1.using (extends)thread class.
 * 2.using (implements)runnable 
 * now interviewer will ask which one is best
 * 
 * runnable is best because if we need to extends any class
 * we can extends any class and implement runnable...
 * 
 * if we are using thread class then we can't extends any other class.
 * 
 * */

class Task implements Runnable{
	
	@Override
	public void run() {
		
		for(int i=0;i<=10;i++) {
			
			if(i==5) {
				
				try {
					
				System.out.println("thread is sleeping....");
				
					Thread.sleep(5000);//current thread will sleep for 5second..
					System.out.println("Sleeping time over it will start again..");
					
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
			System.out.println("the number is :"+i);
		}
	}
}
public class Driver {

public static void main(String[] args) {
	
	System.out.println("main start...");
	
Task task =new Task();
	
	Thread t1=new Thread(task);
	t1.start();
	
	
	System.out.println("main ends....");
}
	
}
