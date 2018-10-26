package com.nissan.training_core_java;

public class throwkeyword {
	static void condition(int n)
	{
		if(n<10)
			throw new ArithmeticException("Number less than 10");
		else
			System.out.println("No exception");
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		condition(9);
		System.out.println("Main function");

	}

}
