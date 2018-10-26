package com.nissan.training_core_java;

public class exceptionhandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{
	int number=(100/0);
	int a[]=new int[5];
	a[5]=100/0;
}
catch(ArithmeticException e)
{
	System.out.println("task completed");
}
catch(ArrayIndexOutOfBoundsException e)
{
	System.out.println("task of array completed");
}
catch(Exception e)
{
	System.out.println("extra");
}
System.out.println("Other parts");

}
	}


