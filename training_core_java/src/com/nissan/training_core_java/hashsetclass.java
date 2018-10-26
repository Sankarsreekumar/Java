package com.nissan.training_core_java;
import java.util.*;
public class hashsetclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet<String> l1=new HashSet<String>();
l1.add("a");
l1.add("bcde");
l1.add("fgh");
Iterator<String> k=l1.iterator();
while(k.hasNext())
{
	System.out.println(k.next());
}
	}

}
