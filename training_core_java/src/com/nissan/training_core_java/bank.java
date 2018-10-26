package com.nissan.training_core_java;

abstract class loan
{
	abstract void roi();
	
}
class PNB extends loan
{
	void roi()
	{
		System.out.println("Rate of interest is 10%");
	}
}
class Baroda extends loan
{
	void roi()
	{
		System.out.println("Rate of interest is 12%");
	}
}
class icici extends loan
{
	void roi()
	{
		System.out.println("Rate of interest is 15%");
	}
}

public class bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PNB a=new PNB();
		a.roi();
		Baroda b=new Baroda();
		b.roi();
		icici c=new icici();
		c.roi();

	}

}
