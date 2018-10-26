package com.nissan.training_core_java;
import java.util.*;
public class treemapclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeMap<Integer,String> map=new TreeMap<Integer,String>();
map.put(100, "Rocky");
map.put(101, "Balboa");
map.remove(101);
//HashMap allows just one null key and any number of null values
for(Map.Entry m:map.entrySet())//Method conversion
{
	System.out.println(m.getKey()+" "+m.getValue());
}
	}

}
