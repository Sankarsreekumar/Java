package com.nissan.training_core_java;

public class Final {
	final String a[]= {"San","Nan","Gowri","Rohit"};
}
class student1 extends Final
{
	static final String b="xyz";
	void add()
	{
		super.a[0]=b;
		System.out.println(super.a[0]);
	}
}
class disply
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
student1 b=new student1();
b.add();
	}

}
