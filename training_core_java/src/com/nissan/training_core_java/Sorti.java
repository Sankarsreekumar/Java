package com.nissan.training_core_java;
interface Sort
{
	default void Sort1(int a[],int n)
	{
		for(int i=0;i<n;i++)
			for(int j=0;j<n-1-i;j++)
			{
				int t=a[i];
				if(a[j]<a[j+1])
				{
					t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
	System.out.println("The sorted array is");
		for(int i=0;i<n;i++)
			System.out.print(a[i]);
			
			
	}
	
}
public class Sorti implements Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sorti a=new Sorti();
		int b[]= {1,3,5,6,3,7,2,1,2,4};
		int l=b.length;
		a.Sort1(b,l);
	}
}


