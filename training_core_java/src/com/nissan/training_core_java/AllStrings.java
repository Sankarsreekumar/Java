package com.nissan.training_core_java;

public class AllStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="Nissan is a company";
char c=s.charAt(2);//gives character at index 22

int l=s.length();//gives length if string

String ns=String.format("Nissan %s", s);//returns a given format
System.out.println(ns);

System.out.println(s.substring(2, 5));//returns substring

int index=s.indexOf('s');//returns index value in string
System.out.println(index);

System.out.println(s.toLowerCase());
System.out.println(s.toUpperCase());

String s2="  Trim  ";
s2=s2.trim();
System.out.println(s2);

String d=s.concat(" concated");//conctenation
System.out.println(d);

String join1=String.join(",","1","2","3");//adds delimiter b/w all arguments
System.out.println(join1);

String emp="";
String emp1="hello";
System.out.println(emp.isEmpty());
System.out.println(emp1.isEmpty());

String c1="Compare";
String c2="Compare";
System.out.println(c1.equals(c2));
	}

}
