package com.nissan.training_core_java;
class Array
{
	void insert(int b)
	{
		int a[]=new int[5];
		for(int i=0;i<5;i++)
		{
			a[i]=b;
			try
			{
				Thread.sleep(500);
				
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		for(int j=0;j<5;j++)
		{
			System.out.print(a[j]+" ");
		}
		System.out.println();
			
	}
}
 class threadone1 extends Thread
{
	Array p;
	threadone1(Array p)
	{
		this.p=p;
	}
	public void run()
	{
		p.insert(100);
	}
}
 class threadtwo2 extends Thread
 {
 	Array p;
 	threadtwo2(Array p)
 	{
 		this.p=p;
 	}
 	public void run()
 	{
 		p.insert(200);
 	}
 }
public class threadsync{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Array obj=new Array();
threadone1 t1=new threadone1(obj);
threadtwo2 t2=new threadtwo2(obj);
t1.start();
t2.start();
	}

}
