package com.Threading01;

class MyThread extends Thread{
	
	@Override
	public void run() {
		System.out.println("Executing run method .......");
		
		System.out.println("MyThread: this is executed by ["+Thread.currentThread().getName()+"] thread");
	}
}

public class Driver {
	
	public static void main(String[] args) {
		
		
		System.out.println("start main ()");
		
		System.out.println("MyThread: this is executed by ["+Thread.currentThread().getName()+"] thread");
		
		MyThread thread1=new MyThread();
		
		thread1.start();
		
		
MyThread thread2=new MyThread();
		
		thread2.start();
		
		
MyThread thread3=new MyThread();
		
		thread3.start();
		
		System.out.println("ends main ()");
	}

}
