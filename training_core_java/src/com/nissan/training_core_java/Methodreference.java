package com.nissan.training_core_java;
interface calculate1
{
	void add(int a,int b);
}
public class Methodreference {
public static void multiply(int a,int b)
{
	System.out.println("Multiply "+(a*b));
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
calculate1 c=Methodreference::multiply;
c.add(10,20);
	}

}
