package com.Threading01;

class EmailSender extends Thread{
	
	public void run() {
		
		/*when thread is in running state  -->
		 * thread is doing work/task
		 * from running to waiting/blocked
		 * once waiting is over thread move to runable state.
		 * once cpu allows ,thread moved to running state
		 * once run method is completed by thread then it moves to terminated or (dead)state
		 * */
		
		System.out.println("Sending email..["+Thread.currentThread().getName()+"]");
	}
}

public class Driver1 {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName());
		//once thread object is created,       state-->new
		EmailSender t1=new EmailSender();
		
		//State -->runnable
		
		t1.start();
	}
}
