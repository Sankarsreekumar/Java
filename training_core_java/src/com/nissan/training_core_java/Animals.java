package com.nissan.training_core_java;

 class Animals {
	 String colour="green";
	 }

class tiger extends Animals{
	String colour="orange";
	void display()
	{
		System.out.println(colour);
		System.out.println(super.colour);
	}
}
 class Testing
{
	public static void main(String[] args)
	{
		tiger c=new tiger();
		c.display();
		
	}
}