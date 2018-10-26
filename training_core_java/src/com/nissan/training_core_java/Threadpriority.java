package com.nissan.training_core_java;

public class Threadpriority extends Thread {
public void run()
{
	System.out.println("Thread is "+Thread.currentThread().getName());
	System.out.println("Thread priority is "+Thread.currentThread().getPriority());
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Threadpriority t1=new Threadpriority();
Threadpriority t2=new Threadpriority();
t1.setPriority(MIN_PRIORITY);
t2.setPriority(MAX_PRIORITY);
t1.start();
t2.start();
	}

}
