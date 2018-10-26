package com.nissan.training_core_java;
interface palin
{
	default int reverse1(int a)
	{
		int n=a;
		int s=0;
		while(n!=0)
		{
			s=s*10+n%10;
			n=n/10;
		}
		return s;
	}
}
public class Palindrome implements palin{
	public static void main(String[] args)
	{
		Palindrome a=new Palindrome();
		int c=45454597;
		System.out.println("the number is "+c);
		int b=a.reverse1(c);
		System.out.println("reversed number is "+b);
		if(b==c)
			System.out.println("Palindrome");
		else
			System.out.println("Not palindrome");
		
		
	}

}
