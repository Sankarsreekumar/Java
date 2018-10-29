package com.nissan.training_core_java;

	abstract class car2
	{
		car2()
		{
			System.out.println("Constructor");
		}
		abstract void run();
		void gear()
		{
			System.out.println("Change ");
	}
	}

	class Abs extends car2 {
		void run()
		{
			System.out.println("Running the car");
		}
	}
	public class Abs1
	{

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	Abs c=new Abs();
	c.run();
	c.gear();
		}

	}