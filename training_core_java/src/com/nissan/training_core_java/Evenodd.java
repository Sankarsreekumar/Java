package com.nissan.training_core_java;

public class Evenodd {
	void separate(int a[])
	{
		int l=a.length;
		int e[]=new int[l];
		int o[]=new int[l];
		class localin
		{
			int even=0;
			int odd=0;
			void split()
			{
				for(int i=0;i<l;i++)
				{
					if(a[i]%2==0)
					{
						e[even]=a[i];
						even++;
					}
						else
						{
							o[odd]=a[i];
							odd++;
						}
				}
			}
			void display()
			{
				for(int i=0;i<even;i++)
					System.out.print(e[i]+" ");
				System.out.println();
				for(int i=0;i<odd;i++)
					System.out.print(o[i]+" ");
				System.out.println();
			}
		}
		
		localin ob=new localin();
		ob.split();
		ob.display();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Evenodd obj=new Evenodd();
int a[]= {1,2,2,2,3,5,6,4,3,2,1,5};
obj.separate(a);
	}

}
