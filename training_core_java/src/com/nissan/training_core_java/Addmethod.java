package com.nissan.training_core_java;

class Adder {
static int add(int a,int b) {
	return a+b;
}
static int add(int a,int b,int c) {
	return a+b+c;
}
}
class Addermethod{
	public static void main() {
		System.out.println(Adder.add(10,20));
		System.out.println(Adder.add(10, 20,30));
	}
}
