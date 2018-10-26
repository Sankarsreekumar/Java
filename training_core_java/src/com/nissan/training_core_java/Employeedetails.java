package com.nissan.training_core_java;

public class Employeedetails {

	public static void main(String[] args) {
		String a[]= {"San","Gowri","Deepu","Soorya"};
		String b="Soorya";
		int i;
		for(i=0;i<4;i++)
		{
			if(b==a[i])
			{
				System.out.println("Name is found and index is "+i);
			}
		}

	}

}
