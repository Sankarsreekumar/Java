package com.nissan.training_core_java;

public class Multithread implements Runnable
{
	public void run()
{
	System.out.println("Running thread");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Multithread o=new Multithread();
Thread o1=new Thread(o);
o1.start();
	}

}
