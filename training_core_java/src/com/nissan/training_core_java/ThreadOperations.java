package com.nissan.training_core_java;

public class ThreadOperations extends Thread {
	int flag;
	int s=0;
	int p=1;
	public void run()
	{
		
		for(int i=1;i<10;i++)
		{
			if(flag==0)
			{
				System.out.println("S= "+s+", i= "+i);
				s=s+i;
				System.out.println("Sum = "+s);
		}
			else
			{
				System.out.println("P= "+p+", i= "+i);
				p=p*i;
				System.out.println("Product = "+p);
		}
			try {
			Thread.sleep(500);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			
		}
				
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ThreadOperations o1=new ThreadOperations();
ThreadOperations o2=new ThreadOperations();
o1.flag=0;
o1.start();
o2.flag=1;
o2.start();
	}

}
