package com.nissan.training_core_java;

public class Demonthread extends Thread{
public void run()
{
	if(Thread.currentThread().isDaemon())
	{
		System.out.println("Daemon thread");
	}
	else
	{
		System.out.println("User thread");
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Demonthread t1=new Demonthread();
Demonthread t2=new Demonthread();
Demonthread t3=new Demonthread();
t2.setPriority(MIN_PRIORITY);
t3.setPriority(MAX_PRIORITY);
t1.setDaemon(true);
t1.start();
t2.start();
t3.start();
	}

}
