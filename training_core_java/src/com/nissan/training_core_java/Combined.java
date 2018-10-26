package com.nissan.training_core_java;
import java.util.Scanner;
import java.util.Arrays;
interface Participants
{
	public void addname();
}
public class Combined extends Thread{
	static int flag=0;
static String n[];
synchronized public void run()
{
	if(flag==1)
	{
		for(String i: n)
		{
			int l=i.length();
		if(l%2==0)
		{
			System.out.print(String.join("-",i.substring(0, l/2-1),i.substring(l/2,l-1))+" ");
		}
		else
		{
			System.out.print(String.join("-",i.substring(0, l/2-1),i.substring(l/2,l/2),i.substring(l/2+1,l-1))+" ");
		}
		}
		System.out.println();
	}
	else
	{
		int age[]= {24,32,45,54,21,32,3,45,67,43};
		int flag=0;
		for(String i: n)
		{
		n[flag]=i+" "+Integer.toString(age[flag]);	
		flag++;
		}
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
n=new String[10];
System.out.println("Enter 10 names to be listed");
Participants p=()->{
	for(int i=0;i<10;i++)
		n[i]=sc.next();
	Arrays.parallelSort(n);
	for(int j=0;j<10;j++)
		System.out.print(n[j]+" ");
	System.out.println();
	Combined obj1=new Combined();
	Combined obj2=new Combined();
	obj1.setPriority(MAX_PRIORITY);
	obj2.setPriority(MIN_PRIORITY);
	flag=0;
	obj1.start();
	flag=1;
	obj1.start();
};


	}

}
