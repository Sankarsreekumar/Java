package com.nissan.training_core_java;

class SuperAnimal1 {
void eating()

{
	System.out.println("Animal is eating");
}
}
class ligar extends SuperAnimal1
{
	void eating()

	{
		System.out.println("eating deer");
	}
	void roaring()

	{
		System.out.println("Ligar is roaringr");
	}
	void working()
	{
		super.eating();
		roaring();
	}

}
public class SuperAnimal
{
	public static void main(String[] args)
	{
		ligar c=new ligar();
		c.working();
	}
	}


