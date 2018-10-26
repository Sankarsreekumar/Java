package com.nissan.training_core_java;

public class StringBufferclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuffer sd=new StringBuffer("nissan");
sd.append(" digital");
System.out.println(sd);

StringBuffer sd1=new StringBuffer("abcdefg");
sd1.replace(2, 4, "xyz");
System.out.println(sd1);

StringBuffer sd2=new StringBuffer("abcdefg");
sd2.reverse();
System.out.println(sd2);

StringBuffer sd3=new StringBuffer();
System.out.println(sd3.capacity());


	}

}
