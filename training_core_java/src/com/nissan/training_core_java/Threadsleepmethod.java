package com.nissan.training_core_java;

public class Threadsleepmethod extends Thread {
public void run()
{
	for(int i=0;i<5;i++)
	{
try
	{
	Thread.sleep(500);
	}
	catch(InterruptedException e)
	{
		System.out.println(e);
	}
	System.out.println(i);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Threadsleepmethod obj=new Threadsleepmethod();
		Threadsleepmethod obj2=new Threadsleepmethod();
		obj.start();
		obj2.start();
	}

}
