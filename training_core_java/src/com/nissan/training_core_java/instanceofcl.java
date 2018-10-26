package com.nissan.training_core_java;

 class pinstanceofcl
{
	
}
public class instanceofcl extends pinstanceofcl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		instanceofcl s=new instanceofcl();
		System.out.println(s instanceof instanceofcl);
		//type comparison returns boolean value
		System.out.println(s instanceof pinstanceofcl);
		//instance is also of parent class type

	}

}
