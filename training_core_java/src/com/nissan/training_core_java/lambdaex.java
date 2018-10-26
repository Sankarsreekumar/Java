package com.nissan.training_core_java;
interface prints
{
	public void printstring();
}

public class lambdaex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="San";
prints p=()->{
	System.out.println(s);
};
	}

}
