package com.nissan.training_core_java;

public class id {
	int identity;
	String name;
	int age;
	id()
	{
		identity=12345;
		name="Sankar";
		age=50;
	}
}
class salary extends id
{
	int s;
	salary()
	{
		super();
		s=10000;
	}
	void discount()
	{
		int d=(int)s*super.age/100;
		s=s+d;
		System.out.println("Name is"+name);
		System.out.println("Age is"+age);
		System.out.println("id is"+identity);
		System.out.println("Salary is"+s);
		
	}
}
class disp
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
