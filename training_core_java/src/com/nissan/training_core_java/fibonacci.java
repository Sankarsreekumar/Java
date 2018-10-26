package com.nissan.training_core_java;
import java.io.FileOutputStream;
public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	FileOutputStream fout=new FileOutputStream("F:\\test.txt");
	int n=0;
	int a1=0;
	int b1;
	String a=Integer.toString(a1)+" ";
	byte by[]=a.getBytes();
	fout.write(by);
	
	while(n<20)
	{
	 a1=b1;
	b1=b1+a1;
	 a=Integer.toString(a1)+" ";
	String b=Integer.toString(b1)+" ";
	 by[]=a.getBytes();
	fout.write(by);
	byte by1[]=b.getBytes();
	fout.write(by1);
	}
	fout.close();
	System.out.println("Done");
}
catch(Exception e)
{
	System.out.println(e);
}
	}

}
