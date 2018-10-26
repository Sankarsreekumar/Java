package com.nissan.training_core_java;

public class jointhread extends Thread{
public void run()
{
	for(int i=1;i<=5;i++)
	{
		try {
			Thread.sleep(800);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println(i);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
jointhread t1=new jointhread();
jointhread t2=new jointhread();
jointhread t3=new jointhread();
t1.start();
try
{
	t1.join();
}
catch(Exception e)
{
	System.out.println(e);
}
t2.start();
t3.start();
	}

}
