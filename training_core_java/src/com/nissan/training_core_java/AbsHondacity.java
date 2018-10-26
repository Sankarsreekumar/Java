package com.nissan.training_core_java;
abstract class car1
{
	abstract void run();
}

public class AbsHondacity extends car1 {
	void run()
	{
		System.out.println("Running the car");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AbsHondacity c=new AbsHondacity();
c.run();
	}

}
