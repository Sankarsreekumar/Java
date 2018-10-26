package com.nissan.training_core_java;

public class Studentdetails2 {
	int studentid;
	String name;
	void display() {
		System.out.println("Student name "+name);
		System.out.println("Student id "+studentid);
	}
Studentdetails2(int i,String n)
{
	this.studentid=i;
	this.name=n;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Studentdetails2 s2=new Studentdetails2(100,"Sankar");
		s2.display();

	}

}
