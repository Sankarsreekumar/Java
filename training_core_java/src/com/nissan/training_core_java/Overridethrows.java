package com.nissan.training_core_java;

import java.io.IOException;

class parent
{
	void display() throws IOException
	{
		throw new IOException("Parent class error");
	}
	}


public class Overridethrows extends parent{
	 void display() throws IOException
	{
		throw new IOException("Child class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overridethrows obj=new Overridethrows();
try
{
	
	obj.display();
}
catch(Exception e)
{
	System.out.println(e);
	System.out.println("Catch block");
}
	}

}
