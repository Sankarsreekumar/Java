package com.nissan.training_core_java;

public class Staticnest {
	static int m=67;
	static class inner
	{
		void display()
		{
			System.out.println("Value "+m);
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Staticnest.inner obj=new Staticnest.inner();
obj.display();
	}

}
