package com.nissan.training_core_java;
interface writable{
void write();

interface readable{
void read();

interface speaking
{
	void speak();
}
}
}

public class Upcasting implements  writable.readable.speaking,writable {
public void read() {
	System.out.println("I am reading");
}
public void write() {
	System.out.println("I am writing");
}
public void speak() {
	System.out.println("I am speaking");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Upcasting n=new Upcasting();
		n.read();
		n.write();
		n.speak();

	}

}
