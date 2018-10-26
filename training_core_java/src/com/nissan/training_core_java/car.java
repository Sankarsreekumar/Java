package com.nissan.training_core_java;

class car {
final void run()
{
	System.out.println("the car runs ");
}
}
 class honda extends car
{
//	void run() {
//		System.out.println("The car runs again");
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
honda h=new honda();
h.run();

	}

}
