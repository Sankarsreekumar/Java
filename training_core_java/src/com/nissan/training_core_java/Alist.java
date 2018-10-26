package com.nissan.training_core_java;
import java.util.*;

public class Alist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<String> l1=new ArrayList <String>();
		LinkedList<String> l2=new LinkedList <String>();
		HashSet<String> l3=new HashSet<String>();
		HashSet<String> l4=new HashSet<String>();
		for(int i=0;i<3;i++) {
		System.out.println("Enter name");
		l1.add(sc.next());
		System.out.println("Enter phone number");
		l2.add(sc.next());
		System.out.println("Enter Age");
		l3.add(sc.next());
		System.out.println("Enter dob");
		l4.add(sc.next());
	}
		l2.addAll(l1);
		l3.addAll(l2);
		l4.addAll(l3);
		Iterator<String> k=l4.iterator();
		while(k.hasNext())
		{
			System.out.println(k.next());
		}

}
}
