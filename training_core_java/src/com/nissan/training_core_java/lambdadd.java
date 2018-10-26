package com.nissan.training_core_java;
interface adder1
{
	public void add(int a,int b);
}
public class lambdadd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
adder1 obj=(a,b)->{
	System.out.println("Added "+(a+b));
};
obj.add(10, 20);
obj.add(100, 200);
	}

}
