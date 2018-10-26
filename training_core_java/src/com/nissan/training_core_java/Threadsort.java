package com.nissan.training_core_java;
import java.util.Scanner;
public class Threadsort extends Thread {
	int flag;
	String n[];
	int m[];
	String n1[];
	public void run()
	{
		if(flag==1)
		{
			int l=m.length;
			for(int i=0;i<l;i++)
			{
				int t=m[i];
				for(int j=0;j<l-1-i;j++)
				{
					if(m[j+1]>m[j])
					{
						t=m[j+1];
						m[j+1]=m[j];
						m[j]=t;
					}
				}
			}
			for(int k=0;k<l;k++)
				System.out.print(m[k]+" ");
			System.out.println();
		}
		else
		{
			int l=n.length;
			int flag=0;
			for(char i='z';i>0;i--)
			{
				for(int j=0;j<l;j++)
				{
					char k=n[j].charAt(0);
					if(i==k)
					{
						n1[flag]=n[j];
						flag++;
					}
					}
						
				}
			for(int k=0;k<l;k++)
				System.out.print(n1[k]+" ");
			System.out.println();
			
			}
			
		}
	

	public static void main(String[] args) 
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Threadsort t1=new Threadsort();
		Threadsort t2=new Threadsort();
		t1.setPriority(MIN_PRIORITY);
		t2.setPriority(MAX_PRIORITY);
		t1.start();
		t2.start();
	}

}
