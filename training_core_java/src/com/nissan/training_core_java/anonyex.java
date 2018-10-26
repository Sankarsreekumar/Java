package com.nissan.training_core_java;
import java.util.Scanner;
interface arr
{
	abstract void order(String a[]);
	abstract void display();
}
class arrange
 {
	String s[];
	void method()
	{
    arr obj=new arr() {
	public void order(String a[])
	 {
		 int l=a.length;
		 char i;
		 String[] c=new String[l];
		 int flag=0;
		 for(i='z';i>='a';i--)
		 {
			 for(int s=0;s<l;s++)
			 {
				 String t=a[s];
				if(t.charAt(0)==i)
				{
					c[flag]=a[s];
					flag++;
				}
			 }
			 
		 }
		 for(int j=0;j<l;j++)
			 System.out.print(c[j]+" ");
		 System.out.println();
				 
	 }
	public void display()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of string array");
		int l=sc.nextInt();
        s=new String[l];
        System.out.println("Enter words");
        for(int i=0;i<l;i++)
        {
        	s[i]=sc.next();
        }
        order(s);
	}
    };
    obj.display();
 }
 }
public class anonyex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arrange ar=new arrange();
		ar.method();

	}

}
