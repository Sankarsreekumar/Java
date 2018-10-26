package com.nissan.training_core_java;
class P
{
	void display()
	{
		System.out.println("This is Parent class");
	}
}
public class instanceqn extends P {
public static void main(String[] args)
{
	instanceqn a=new instanceqn();
	if(a instanceof P==true)
		a.display();
}
}
