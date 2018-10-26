package com.nissan.training_core_java;

abstract class Shapes {
	abstract void area(int a,int b);
}
class circle extends Shapes
{
	void area(int a,int b)
	{
		System.out.println("Area of circle is "+(3.14*a*b));
	}
}
class square extends Shapes
{
	void area(int a,int b)
	{
		System.out.println("Area of sqaure is "+(a*b));
	}
}
class rectangle extends Shapes
{
	void area(int a,int b)
	{
		System.out.println("Area of rectangle is "+(b*a));
	}
}
class Shape
{
	public static void main(String[] args) {
		circle a=new circle();
		a.area(10,10);
		square b=new square();
		b.area(12,12);
		rectangle c=new rectangle();
		c.area(10,12);
	}
		
		// TODO Auto-generated method stub

	}

