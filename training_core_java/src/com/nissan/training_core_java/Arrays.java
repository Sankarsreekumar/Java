package com.nissan.training_core_java;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,2,3,4,3,6,5,2,7,8,1,5,8,9,10,11,45,65,12,34,65,65,65,65,65,65,89,89,1};
int l=a.length;
int stop=0;
for(int i=0;i<l;i++)
{
	int b=a[i];
	while(b==0)
	{
		if(i==l-1)
		{
			stop=1;
			break;
		}
		i++;
	b=a[i];
	}
	if(stop==1)
		break;
	int flag=0;
	for(int j=i;j<l;j++)
	{
		if(b==a[j])
		{
			flag++;
			a[j]=0;
		}
	}
	if(flag>0)
		System.out.println(b+" is repeating "+flag+" times");
	}
	}

}
