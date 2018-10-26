package com.nissan.training_core_java;


interface calculate//public and abstract
{
	public void add(int a,int b);
	public void subtract(int a,int b);
	default void multiply(int a,int b)
	{
		int c=a*b;
		System.out.println("multiplied "+c);
	}
}
public class interfoperator implements calculate {
	public void add(int a,int b)
	{
		int c=a+b;
		System.out.println("Addition "+c);
	}
	public void subtract(int a,int b)
	{
		int c=a-b;
		System.out.println("Subtraction "+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
interfoperator a=new interfoperator();
a.add(2,4);
a.subtract(5,2);
a.multiply(4,6);
	}

}