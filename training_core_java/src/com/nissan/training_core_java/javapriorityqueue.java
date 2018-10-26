package com.nissan.training_core_java;
import java.util.*;
public class javapriorityqueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PriorityQueue<String> l1=new PriorityQueue<String>();
l1.add("zfgg");
l1.add("bcde");
l1.add("fgh");
l1.add("agh");
System.out.println("head: "+l1.element());
System.out.println("head: "+l1.peek());
Iterator<String> k=l1.iterator();
while(k.hasNext())
{
	System.out.println(k.next());
}
l1.remove();
System.out.println("removing");
Iterator<String> l=l1.iterator();
while(l.hasNext())
{
	System.out.println(l.next());
}

	}

}