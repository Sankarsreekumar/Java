package com.nissan.training_core_java;


public class innerclass {
private int data=333;
class Inner
{
	void message()
	{
		System.out.println("This is inner class "+data);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
innerclass obj=new innerclass();
innerclass.Inner in=obj.new Inner();
in.message();

	}

}
