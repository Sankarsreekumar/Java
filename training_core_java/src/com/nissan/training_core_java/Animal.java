package com.nissan.training_core_java;

 class Animal11 {
	 void voice() {
		 System.out.println("Making Sounds ");
	 }

}
class cheetah extends Animal11{
	void roar()
	{
		System.out.println("Cheetah is roaring");
	}
}
 class Animal
{
	public static void main(String[] args)
	{
		cheetah c=new cheetah();
		c.voice();
		c.roar();
	}
}