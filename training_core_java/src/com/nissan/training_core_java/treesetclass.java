package com.nissan.training_core_java;
import java.util.*;
public class treesetclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeSet<String> l1=new TreeSet<String>();
l1.add("zfgg");
l1.add("bcde");
l1.add("fgh");
l1.add("agh");

Iterator<String> k=l1.iterator();
while(k.hasNext())
{
	System.out.println(k.next());
}
	}

}
