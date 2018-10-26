package com.nissan.training_core_java;
interface draw//public and abstract
{
	public void drwsomething();
}
interface write//public and abstract
{
	public void writesomething();
	default void ink()
	{
		System.out.println("Default method");
	}
}
public class Jinterface implements draw,write {
	public void drwsomething()
	{
		System.out.println("This is a method of interface");
	}
	public void writesomething()
	{
		System.out.println("Witten");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Jinterface a=new Jinterface();
a.drwsomething();
a.writesomething();
a.ink();
	}

}
