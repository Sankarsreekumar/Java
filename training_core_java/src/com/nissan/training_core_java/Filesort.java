package com.nissan.training_core_java;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class Filesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner sc=new Scanner(System.in);
System.out.println("Enter size of array");
int n=sc.nextInt();
String a[]=new String[n];
System.out.println("Enter elements");
for(int i=0;i<n;i++)
	a[i]=sc.next();
for(int j=0;j<n;j++)
{
	
	byte b[]=a[j].getBytes();
	try {
		FileOutputStream fout=new FileOutputStream("E:\\unsorted.txt");
	fout.write(b);
	fout.close();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
try {

FileInputStream fin=new FileInputStream("E:\\\\unsorted.txt");


	}

}
