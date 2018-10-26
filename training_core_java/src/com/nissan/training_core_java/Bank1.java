package com.nissan.training_core_java;
import java.util.Scanner;

abstract class Bank11 {
abstract void roi();
double interest(int a,int r)
{
	double c=a*r/100;
	return c;
}
}
class deposit extends Bank11
{
  int amt;
	void roi()
	{
	}
	int input(int c,int b)
	{
		 c=c+b;
		return c;
	}
}
class depositfd extends Bank11
{
	int amt1;
	Scanner sc=new Scanner(System.in);
	void roi()
	{
	}
	int input(int c,int b)
	{
		if(c<500)
		{
			
			while(c<=500)
			{
				System.out.println("Enter a greater amount");
				c=sc.nextInt();
			}
		
	}
		return c+b;
	}
}
class current extends Bank11
{
	int amount;
	int r=20;
	int i;
	void roi()
	{
		System.out.println("Rate of interest is 20%");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the loan amount");
		i=sc.nextInt();
		}
	boolean check(int b)
	{
		if(b<5000)
		{
			System.out.println("Insufficient Balance");
			return false;
		}
		else
		return true;
	}
}
class fd extends Bank11
{
	int amount1;
	int r=10;
	int i;
	void roi()
	{
		System.out.println("Rate of interest is 10%");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the loan amount");
		i=sc.nextInt();
		}
	boolean check(int c,int d)
	{
		if(c<2*d)
		{
			System.out.println("Insufficient Balance");
			return false;
		}
		else
		return true;
	}
	
}
class direct extends Bank11
{
	int r=27;
	int i;
	void roi()
	{
		System.out.println("Rate of interest is 27%");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the loan amount");
		i=sc.nextInt();
		}
	
}
			
	class Bank1
	{
		Scanner sc=new Scanner(System.in);
		String xyz1="yes";
		void run()
		{
			while(xyz1=="yes")
			{
			int fd=10000;
			int d=10000;
		    int pin1=1234;
			System.out.println("Welcome to the online banking pltform");
			System.out.println("Enter the pin");
			int pin=sc.nextInt();
			if(pin1==pin)
			{
	    	System.out.println("Enter the required option number");
	    	System.out.println("");
	    	System.out.println("1.Take Loan");
	    	System.out.println("2.Deposit");
	    	System.out.println("3.Deposit FD");
	    	System.out.println("4.View blance");
	    	int x=sc.nextInt();
	    	if(x==1)
	    	{
	    		System.out.println("Enter the required option number");
	        	System.out.println("");

	    		System.out.println("1. From Current");
	    		System.out.println("2. From FD");
	    		System.out.println("3. From Direct");
	    		int y=sc.nextInt();
	    		
	    		if(y==1)
	    		{
	    			current one=new current();
	    			one.roi();
	    			boolean f=one.check(d);
	    			if(f==true)
	    				System.out.println("Loan Sanctioned");
	    		}
	    		else if(y==2)
	    		{
	    			fd two=new fd();
	    			two.roi();
	    			
	    			boolean f=two.check(two.i,fd);
	    			if(f==true)
	    				System.out.println("Loan Sanctioned");
	    		}
	    		else
	    		{
	    			direct three=new direct();
	    			three.roi();
	    				System.out.println(three.i+" Loan Sanctioned");
	    		}
	    	}
	    	else if(x==2)
	    	{
	    		deposit four=new deposit();
	    		System.out.println("Enter amount to be deposited");
	    		int z=sc.nextInt();
	    		d=four.input(d, z);
	    		System.out.println(z+" is deposited and balance is "+d);
	    	}
	    	else if(x==3)
	    	{
	    		depositfd five=new depositfd();
	    		System.out.println("Enter amount to be deposited");
	    		int abc=sc.nextInt();
	    		fd=five.input(fd, abc);
	    	}
	    	else
	    	{
	    		System.out.println("Balace in Account "+d);
	    		System.out.println("Balace in Fixed Account "+fd);
	    	}
			}
			else 
				System.out.println("wrong pin");
			System.out.println("Do you want to try again?");
			 xyz1=sc.next();
			}
	    		}
    public static void main(String[] args) {
    	Bank1 obj=new Bank1();
    	obj.run();
		// TODO Auto-generated method stub
    	
    		}
    	}
    	

	
