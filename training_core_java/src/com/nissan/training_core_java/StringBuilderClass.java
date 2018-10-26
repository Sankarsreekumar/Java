
package com.nissan.training_core_java;

public class StringBuilderClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuilder sd=new StringBuilder("nissan");
sd.append(" digital");
System.out.println(sd);

StringBuilder sd1=new StringBuilder("abcdefg");
sd1.replace(2, 4, "xyz");
System.out.println(sd1);

StringBuilder sd2=new StringBuilder("abcdefg");
sd2.reverse();
System.out.println(sd2);

StringBuilder sd3=new StringBuilder();
System.out.println(sd3.capacity());


	}

}