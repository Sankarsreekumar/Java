package com.nissan.training_core_java;

public class sleeptest extends Thread {
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
		sleeptest obj=new sleeptest();
		sleeptest obj2=new sleeptest();
		obj.run();
		obj2.run();
		//There is no context switching
	}

}

