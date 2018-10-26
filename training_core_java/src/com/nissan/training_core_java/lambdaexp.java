package com.nissan.training_core_java;
interface Printdisp
{
	public void display();
}
public class lambdaexp {
int value=100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int value=100;
Printdisp p1=()->{
	System.out.println("Print value "+value);
};
	}

}
