package com.nissan.training_core_java;

public class Wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x=10;
Integer i=Integer.valueOf(x);
Integer j=x;//this is boxing
Integer a=new Integer(19);
int b=a.intValue();
int c=a;//Unboxing

System.out.println(x+" "+i+" "+j+" is boxing");
System.out.println(a+" "+b+" "+c+" is unboxing");
	}

}
