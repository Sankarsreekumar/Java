package com.nissan.training_core_java;

public class Stringex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s[]= {"abc","def","ghi","jkl","mno","pqr","stu","vwx","yza"};
int l=s.length;
for(int i=0;i<l;i++)
{
	String a=s[i];
	if(i%2==0)
		System.out.println(a.charAt(0));
	else
		System.out.println(a.substring(a.length()-2));
}
	}

}
