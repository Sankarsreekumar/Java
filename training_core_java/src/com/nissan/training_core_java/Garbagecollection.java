package com.nissan.training_core_java;

public class Garbagecollection {
public void finalize()
{
	System.out.println("Garbage collected");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Garbagecollection s1=new Garbagecollection();
Garbagecollection s2=new Garbagecollection();
s1=null;
s2=null;
System.gc();
	}

}
