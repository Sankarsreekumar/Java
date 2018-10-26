package com.nissan.training_core_java;
public class Staticnest1 {
	int n=77;
	static String s="Non Static";
	static class inner
	{
		void display()
		{
			System.out.println(s);
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Staticnest1.inner obj=new Staticnest1.inner();
obj.display();
	}

}
