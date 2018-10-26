package com.nissan.training_core_java;
import java.io.FileOutputStream;
public class Fileout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	FileOutputStream fout=new FileOutputStream("E:\\test.txt");
	String a="Nissan";
	byte b[]=a.getBytes();
	fout.write(b);
	fout.close();
	System.out.println("Done");
}
catch(Exception e)
{
	System.out.println(e);
}
	}

}
