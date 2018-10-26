package com.nissan.training_core_java;
import java.util.*;
public class Mapinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<Integer,String> map=new HashMap<Integer,String>();
map.put(100, "Rocky");
map.put(101, "Balboa");
//HashMap allows just one null key and any number of null values
for(Map.Entry m:map.entrySet())//Method conversion
{
	System.out.println(m.getKey()+" "+m.getValue());
}
	}

}
