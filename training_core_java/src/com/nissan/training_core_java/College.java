package com.nissan.training_core_java;

public class College {
	int id=0;
	String name="";
	int rollno=0;
	void display()
	{
		System.out.println("Name is "+name);
		System.out.println("Id number is "+id);
		System.out.println("Roll no "+rollno);
	}
}
class student extends College
{
	public static void main(String[] args) {
		student obj=new student();
		obj.id=21;
		obj.name="Sankar";
		obj.rollno=12;
		obj.display();

	}

}
