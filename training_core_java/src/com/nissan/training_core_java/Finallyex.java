package com.nissan.training_core_java;

public class Finallyex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{
	int d=20/0;
	System.out.println(d);
}
catch(NullPointerException e)
{
	System.out.println(e);
}
finally
{
	System.out.println("Finally block");
}
	}

}
