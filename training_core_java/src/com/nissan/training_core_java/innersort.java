package com.nissan.training_core_java;

public class innersort {
	class sort
	{
		int sorting()
		{
			int a[]= {2,1,4,3,6,5,7,4,3,1};
			int l=a.length;
			int t;
			for(int i=0;i<l;i++)
			{
				for(int j=0;j<l-i-1;j++)
				{
					if(a[j]>a[j+1])
					{
						t=a[j];
						a[j]=a[j+1];
						a[j+1]=t;
					}
				}
			}
			return a[l-1];
		}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		innersort obj=new innersort();
		innersort.sort in=obj.new sort();
		System.out.println("largest number is "+in.sorting());

	}

}
