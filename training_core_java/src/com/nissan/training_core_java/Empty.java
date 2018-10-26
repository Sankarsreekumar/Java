package com.nissan.training_core_java;

import java.util.Scanner;

public class Empty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter string");
		String n=s.next();
		if(n=="")
		{
			System.out.println("Enter string");
			String n1=s.next();
			System.out.println(String.join(",", n1,"added"));
		}

	}

}
