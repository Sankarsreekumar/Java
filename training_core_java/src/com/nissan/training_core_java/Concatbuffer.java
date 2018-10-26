
package com.nissan.training_core_java;

import java.util.Scanner;

 public class Concatbuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of employees");
		int n=s.nextInt();
		StringBuffer[] a=new StringBuffer[n];
		StringBuffer[] b=new StringBuffer[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter name "+(i+1));
			a[i]=new StringBuffer(s.next());
		}
for(int x=0;x<n-1;x++)
{
	String t=a[x].toString();
	int flag=0;
	for(int y=x+1;y<n;y++)
	{
		String t1=a[y].toString();
		if(t.equalsIgnoreCase(t1))
		{
			flag++;
			if(flag==1)
			{
			System.out.println("Enter the last name at index "+x);
			a[x]=a[x].append(new StringBuffer(" "+s.next()));
			System.out.println("Enter the last name at index "+y);
			a[y]=a[y].append(new StringBuffer(" "+s.next()));
			}
			
			else
			{
				System.out.println("Enter the last name at index "+y);
				a[y]=a[y].append(new StringBuffer(s.next()));
				}
		}
	}
}
a.toString();
for(int i=0;i<n;i++)
{
	System.out.println(a[i]+" ");
	}
	}
}
