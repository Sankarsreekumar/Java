package com.nissan.training_core_java;
import java.io.IOException;
public class testingthrows {
	
	void master() throws IOException{
		throw new IOException("Error has occured");
		
	}
	void nmaster()throws IOException
	{
		master();
	}
void pmaster()
{
	try {
		nmaster();
	}
	catch(Exception e) {
		System.out.println("error handled");
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
testingthrows obj=new testingthrows();
obj.pmaster();
System.out.println("Other part");
	}

}
