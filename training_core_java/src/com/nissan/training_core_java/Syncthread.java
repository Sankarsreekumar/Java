package com.nissan.training_core_java;
class Print
{
	void printvalue(int a)
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(i*a);
			try
			{
				Thread.sleep(500);
				
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
			
	}
}
 class threadone extends Thread
{
	Print p;
	threadone(Print p)
	{
		this.p=p;
	}
	public void run()
	{
		p.printvalue(100);
	}
}
 class threadtwo extends Thread
 {
 	Print p;
 	threadtwo(Print p)
 	{
 		this.p=p;
 	}
 	public void run()
 	{
 		p.printvalue(100);
 	}
 }
public class Syncthread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Print obj=new Print();
threadone t1=new threadone(obj);
threadtwo t2=new threadtwo(obj);
t1.start();
t2.start();
	}

}
