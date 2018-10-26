package com.nissan.training_core_java;

public class Customerbuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer[] name= { new StringBuffer("abc"),
				               new StringBuffer("def"),
				               new StringBuffer("ghi"),
				               new StringBuffer("jkl")};
		StringBuffer[] dob={ new StringBuffer("24"),
	               new StringBuffer("1"),
	               new StringBuffer("1996"),
	               new StringBuffer("11"),
		           new StringBuffer("4"),
		           new StringBuffer("1998"),
                  new StringBuffer("9"),
                  new StringBuffer("10"),
                  new StringBuffer("1996"),
                   new StringBuffer("3"),
	               new StringBuffer("1"),
	               new StringBuffer("1998")};
		int l=dob.length;
		for(int i=0;i<l/3;i++)
		{
			int j=i/3;
				dob[i*3]=dob[i*3].append("/"+dob[i*3+1]+"/");
				dob[i*3]=dob[i*3].append(dob[i*3+2]);
			}
			for(int i=0;i<4;i++)
			{
				System.out.println(name[i]+" "+dob[i*3]);
				
			}
			
		}

	}
