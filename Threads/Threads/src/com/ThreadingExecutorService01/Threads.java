package com.ThreadingExecutorService01;
 
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Task implements Callable<Boolean> {
	EmailSender emailSender;

	public Task(EmailSender emailSender) {
		super();
		this.emailSender = emailSender;
	}

	@Override
	public Boolean call() {
		System.out.println("executing call()..");
		return emailSender.sendEmail(emailSender.email, emailSender.body);

	}

}

public class Threads {
	public static void main(String[] args) throws InterruptedException, ExecutionException {

		System.out.println("Main..Start.... ");
		// executor service
		
		
	           //FixedThreadPool....
		
		//ExecutorService ex = Executors.newFixedThreadPool(5);
		
		/*
		 * based on work,it will decide how many thread to be launched.
		 * */
	//	ExecutorService ex = Executors.newCachedThreadPool();
		
		
		/*
		 *single thread only one thread will complete task 
		 * */
		ExecutorService ex = Executors.newSingleThreadExecutor();
		
		
		
		for (int i = 0; i < 10; i++) {
			EmailSender emailSender = new EmailSender("vivek@gmail.com_" + i, "this is email body" + i);
			Task task = new Task(emailSender);

			
			Future<Boolean> future = ex.submit(task);
			/*
			System.out.println("email status is :" + future.get());//What future.get is doing? It's blocking the current thread till it gets the result from the first thread.
			*/
			
			//So, future.get is… a Blocking call.
			// it will block your Current threat till it get the response.
			
		}

		System.out.println("Main..end.... ");
		ex.shutdown();
	}
}
