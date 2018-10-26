package com.nissan.training_core_java;
import java.util.*;
public class Arrylistcollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> list=new ArrayList <String>();
list.add("Rahul");
list.add("Sansa");
list.add("John Snow");
Iterator i=list.iterator();
while(i.hasNext())
{
	System.out.println(i.next());
}
list.remove("Sansa");
Iterator j=list.iterator();
while(j.hasNext())
{
	System.out.println(j.next());
}
ArrayList<String> list1=new ArrayList <String>();
list1.add("List 2");
list1.addAll(list);
Iterator k=list1.iterator();
while(k.hasNext())
{
	System.out.println(k.next());
}
Iterator k1=list1.iterator();
for(String n:list1)
{
	System.out.println("Using for each "+n);
}

	}

}
